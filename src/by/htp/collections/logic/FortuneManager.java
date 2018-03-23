package by.htp.collections.logic;

import java.util.List;
import java.util.Set;

import by.htp.collections.flower.Flower;
import by.htp.collections.gardener.Gardener;
import by.htp.collections.input.Input;
import by.htp.collections.logic.divination.Divination;
import by.htp.collections.logic.fortuneteller.FortuneTeller;
import by.htp.collections.logic.history.FortuneHistory;

public class FortuneManager {

	private static final int FLOWER_COUNT = 5;
	private Gardener gardener;
	private FortuneTeller fortuneTeller;
	private FortuneHistory history;
	private List<Flower> flowerList;

	public FortuneManager(Gardener gardener, FortuneTeller fortuneTeller, FortuneHistory history) {
		this.gardener = gardener;
		this.fortuneTeller = fortuneTeller;
		this.history = history;
		init();
	}

	private void init() {
		flowerList = gardener.getChamomiles("Ромашка", FLOWER_COUNT);
	}

	public void start(Set<Client> clientSet) {
		for (Client client : clientSet) {
			System.out.println("Гадание для клиента " + client.getName());
			do {
				if (flowerList.size() > 0) {

					boolean checkTimeDivination = history.checkTimeDivination(client);
					if (checkTimeDivination) {
						history.add(client);

						Flower flower = flowerList.get(0);

						startForClient(client, flower);

						flowerList.remove(0);
						System.out.println();
						System.out.println("Осталось " + flowerList.size() + " ромашек");
					}
				} else {
					System.out.println("Цветы закончились!");
					return;
				}
			} while (!Input.askForFortune());
		}
	}

	private void startForClient(Client client, Flower flower) {
		List<Divination> divinationList = fortuneTeller.getDivinationList();

		printDivinationList(divinationList);

		int divinationNumber = Input.enterDivinationNumber();
		Divination divination = fortuneTeller.getDivination(divinationNumber);

		String answer = fortuneTeller.getAnswer(flower, divination);
		System.out.println("Количество лепестков: " + flower.getPetals().size());
		System.out.println("Результат гадания: " + answer);
	}

	private void printDivinationList(List<Divination> divinationList) {
		for (int i = 1; i <= divinationList.size(); i++) {
			System.out.println(i + ". " + divinationList.get(i - 1).getName());
		}
		System.out.println();
	}
}
