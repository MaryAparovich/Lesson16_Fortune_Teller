package by.htp.collections.logic.divination;

public class WorkDivination extends Divination {

	public WorkDivination(String name) {
		super(name);
		addAnswerForWork();
	}

	private void addAnswerForWork() {
		add("������ �� ������");
		add("�� ������ �� ������");
		add("������");
		add("������� � ���������");
		add("������� � ���������");
	}
}
