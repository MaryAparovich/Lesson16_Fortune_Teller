package by.htp.collections.logic.divination;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestWorkDivination {

	WorkDivination work;

	@Before
	public void initTestData() {
		work = new WorkDivination("Работа");
	}

	@Test
	public void testIfNameIsRight() {
		assertEquals("Работа", work.getName());
	}

	@Test
	public void testIfAnswerRight() {
		assertEquals("Примут на работу", work.getAnswerByIndex(1));
	}	
}
