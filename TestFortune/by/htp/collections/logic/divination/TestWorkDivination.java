package by.htp.collections.logic.divination;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestWorkDivination {

	WorkDivination work;

	@Before
	public void initTestData() {
		work = new WorkDivination("������");
	}

	@Test
	public void testIfNameIsRight() {
		assertEquals("������", work.getName());
	}

	@Test
	public void testIfAnswerRight() {
		assertEquals("������ �� ������", work.getAnswerByIndex(1));
	}	
}
