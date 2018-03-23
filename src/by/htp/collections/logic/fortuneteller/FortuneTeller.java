
package by.htp.collections.logic.fortuneteller;

import java.util.List;

import by.htp.collections.flower.Flower;
import by.htp.collections.logic.divination.Divination;

public class FortuneTeller {

	private String name;
	private List<Divination> divinationList;

	public FortuneTeller(String name, List<Divination> divinationList) {
		this.name = name;
		this.divinationList = divinationList;
	}

	public List<Divination> getDivinationList() {
		return divinationList;
	}
	
	public String getName() {
		return name;
	}

	public Divination getDivination(int index) {
		return divinationList.get(index - 1);
	}

	public String getAnswer(Flower chamomile, Divination divination) {

		int petalCount = chamomile.getPetals().size();
		int size = divination.getAnswerSize();
		int answerIndex = petalCount % size;

		String answer = divination.getAnswerByIndex(answerIndex);

		return answer;
	}
}
