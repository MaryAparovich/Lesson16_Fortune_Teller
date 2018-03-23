package by.htp.collections.logic.divination;

public class LoveDivination extends Divination {
	
	public LoveDivination(String name) {
		super(name);
		addAnswerForLove();
	}
	
	private void addAnswerForLove() {
		add("Любит");
		add("Не любит");
		add("Никогда не полюбит");
		add("К сердцу прижмет");
		add("К черту пошлет");
	}
}
