package by.htp.collections.logic.divination;

public class LoveDivination extends Divination {
	
	public LoveDivination(String name) {
		super(name);
		addAnswerForLove();
	}
	
	private void addAnswerForLove() {
		add("�����");
		add("�� �����");
		add("������� �� �������");
		add("� ������ �������");
		add("� ����� ������");
	}
}
