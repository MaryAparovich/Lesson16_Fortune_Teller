package by.htp.collections.logic.divination;

import java.util.ArrayList;
import java.util.List;

public abstract class Divination {

	private String name;
	public List<String> answers = new ArrayList<>();

	public Divination() {
		
	}

	public Divination(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void add(String answer) {
		answers.add(answer);
	}

	public int getAnswerSize() {
		return answers.size();
	}

	public String getAnswerByIndex(int index) {
		if (index == 0) {
			index = answers.size() - 1;
		} else if (index >= answers.size() || index < 0) {
			return null;
		} else {
			index = index - 1;
		}
		return answers.get(index);
	}

}
