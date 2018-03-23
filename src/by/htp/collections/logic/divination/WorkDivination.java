package by.htp.collections.logic.divination;

public class WorkDivination extends Divination {

	public WorkDivination(String name) {
		super(name);
		addAnswerForWork();
	}

	private void addAnswerForWork() {
		add("Примут на работу");
		add("Не примут на работу");
		add("Уволят");
		add("Повысят в должности");
		add("Понизят в должности");
	}
}
