package by.htp.collections.flower;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import by.htp.collections.gardener.Gardener;
import by.htp.collections.logic.fortuneteller.FortuneTeller;

public class TestFlower {

	private Gardener gardener;

	@Before
	public void init() {
		gardener = new Gardener();
	}

	@Test
	public void testGetChamomiles() {
		List<Flower> listFlower = gardener.getChamomiles("Ромашка", 5);
		assertEquals(5, listFlower.size());
	}

}
