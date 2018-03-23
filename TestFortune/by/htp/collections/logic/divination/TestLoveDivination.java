package by.htp.collections.logic.divination;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import by.htp.collections.logic.divination.LoveDivination;

public class TestLoveDivination {

	private LoveDivination loveDivination;
	
	@Before
	public void initTestData() {
		loveDivination = new LoveDivination("Любовь");
	}
	
	@Test
	public void testIfNameIsRight() {
		assertEquals("Любовь", loveDivination.getName());
	}
	
	@Test
	public void testIfAnswerRight() {
		String answer = loveDivination.getAnswerByIndex(1);
		assertEquals("Любит", answer);
	}
	
	@Test
	public void testIfListFilled() {
		int answerSize = loveDivination.getAnswerSize();
		assertEquals(5, answerSize);
	}
	
	@Test
	public void testIfAnswerFailed() {
		String answer = loveDivination.getAnswerByIndex(100);
		assertNull(answer);
	}
}
