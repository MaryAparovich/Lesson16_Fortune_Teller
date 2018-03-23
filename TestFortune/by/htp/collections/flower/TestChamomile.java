package by.htp.collections.flower;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import by.htp.collections.flower.Chamomile;
import by.htp.collections.flower.Flower;
import by.htp.collections.flower.Petal;
import by.htp.collections.gardener.Gardener;

public class TestChamomile {
	
	private List<Petal> petals;
	private Gardener gardener;
	private Flower flower;
	
	@Test
	public void testIfNullPetals() {
		petals = new LinkedList<>();
		Flower flower = new Chamomile("Ромашка", petals);
		assertEquals(0, flower.getPetals().size());
	}

	@Test
	public void testPetalCount() {
		gardener = new Gardener();
		flower = gardener.getChamomile("Ромашка", 5);
		assertEquals(5, flower.getPetals().size());
	}
}
