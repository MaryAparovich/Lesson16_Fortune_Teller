package by.htp.collections.flower;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import by.htp.collections.flower.Petal;

public class TestPetal {

	private Petal petal;
	
	@Test
	public void testIfColorIsEmpty() {
		petal = new Petal();
		assertNull(petal.getColor());
	}
	
	@Test
	public void testIfColorOk() {
		petal = new Petal("red");
		assertEquals("red", petal.getColor());
	}
}
