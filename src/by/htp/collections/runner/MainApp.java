package by.htp.collections.runner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import by.htp.collections.gardener.Gardener;
import by.htp.collections.logic.Client;
import by.htp.collections.logic.FortuneManager;
import by.htp.collections.logic.divination.Divination;
import by.htp.collections.logic.divination.LoveDivination;
import by.htp.collections.logic.divination.LuckDivination;
import by.htp.collections.logic.divination.WorkDivination;
import by.htp.collections.logic.fortuneteller.FortuneTeller;
import by.htp.collections.logic.history.FortuneHistory;

public class MainApp {

	public static void main(String[] args) {

		List<Divination> listDivination = new ArrayList<>();

		Divination love = new LoveDivination("Любовь");
		Divination work = new WorkDivination("Работа");
		Divination luck = new LuckDivination("Удача");

		listDivination.add(love);
		listDivination.add(work);
		listDivination.add(luck);

		Gardener gardener = new Gardener();
		FortuneTeller fortuneTeller = new FortuneTeller("Азалия", listDivination );
		FortuneHistory fortuneHistory = new FortuneHistory();

		FortuneManager fortuneManager = new FortuneManager(gardener, fortuneTeller, fortuneHistory);

		Client client1 = new Client("Masha");
		Client client2 = new Client("Sasha");

		Set<Client> clientSet = new HashSet<>();
		clientSet.add(client1);
		clientSet.add(client2);

		fortuneManager.start(clientSet);
	}
}
