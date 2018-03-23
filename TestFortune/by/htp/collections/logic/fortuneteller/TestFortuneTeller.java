package by.htp.collections.logic.fortuneteller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import by.htp.collections.flower.Flower;
import by.htp.collections.gardener.Gardener;
import by.htp.collections.logic.divination.Divination;
import by.htp.collections.logic.divination.LoveDivination;
import by.htp.collections.logic.divination.LuckDivination;
import by.htp.collections.logic.divination.WorkDivination;
import by.htp.collections.logic.divination.TestWorkDivination;

public class TestFortuneTeller {

	private FortuneTeller fortuneTeller;
	private Gardener gardener;
	List<Divination> divinationList;

	@Before
	public void initFortunaTeller() {
		fortuneTeller = new FortuneTeller("������", divinationList);
		gardener = new Gardener();
	}
	
	@Test
	public void testInitFortuneTeller() {
		String name = "������";
		assertEquals(name, fortuneTeller.getName());
	}

	@Test
	public void testLuckAnswer() {
		Flower flower = gardener.getChamomile("�������", 5);
		Divination divination = new LuckDivination("�����");

		String answer = fortuneTeller.getAnswer(flower, divination);

		assertEquals("�������", answer);
	}

	@Test
	public void testLoveAnswer() {
		Flower flower = gardener.getChamomile("�������", 2);
		Divination divination = new LoveDivination("������");

		String answer = fortuneTeller.getAnswer(flower, divination);

		assertEquals("�� �����", answer);
	}

	@Test
	public void testWorkAnswer() {
		Flower flower = gardener.getChamomile("�������", 1);
		Divination work = new WorkDivination("������");

		String answer = fortuneTeller.getAnswer(flower, work);
		assertEquals("������ �� ������", answer);
	}

	@Test(expected=NullPointerException.class)
	public void testWithNullReferences() {
		
		Flower chamomile = null;
		Divination divination = null;
		
		String answer = fortuneTeller.getAnswer(chamomile, divination);
		assertNotNull(answer);
	}

}
