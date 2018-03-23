package by.htp.collections.flower;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import by.htp.collections.flower.Chamomile;
import by.htp.collections.flower.Flower;
import by.htp.collections.flower.Petal;

public class TestChamomile {
	
	@Test
	public void testIfNullPetals() {
		List<Petal> petals = new LinkedList<>();
		Flower flower = new Chamomile("Ромашка", petals);
		assertEquals(0, flower.getPetals().size());
	}

	@Test
	public void testPetalCount() {
		int petalCount = 5;
		List<Petal> listPetal = new LinkedList<>();
		
		for (int i = 0; i < petalCount; i++) {
			Petal petal = new Petal();
			listPetal.add(petal);
		}
		
		Flower flower = new Chamomile("Ромашка", listPetal);
		
		assertEquals(listPetal, flower.getPetals());
	}
}
