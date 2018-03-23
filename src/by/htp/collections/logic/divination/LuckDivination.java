package by.htp.collections.logic.divination;

public class LuckDivination extends Divination{

	public LuckDivination(String name) {
		super(name);
		addAnswerForLuck();
	}

	private void addAnswerForLuck() {
		add("Повезет");
		add("Не повезет");
	}
}
