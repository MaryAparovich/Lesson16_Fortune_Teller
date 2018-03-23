package by.htp.collections.gardener;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import by.htp.collections.flower.Chamomile;
import by.htp.collections.flower.Flower;
import by.htp.collections.flower.Petal;

public class Gardener {
	
	public Flower getChamomile(String name, int petalCount) {
		List<Petal> listPetal = createPetalList(petalCount);
		Flower flower = new Chamomile(name, listPetal);
		return flower;
	}
	
	public List<Flower> getChamomiles(String name, int count) {	
		List<Flower> flowerList = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			Flower flower = createFlower(name);
			flowerList.add(flower);
		}
		return flowerList;
	}
	
	private Flower createFlower(String flowerName) {
		int countPetal = (int) Math.floor(Math.random() * 10 + 1);
		List<Petal> listPetal = createPetalList(countPetal);
		Flower chamomile = new Chamomile(flowerName, listPetal);
		return chamomile;
	}

	private List<Petal> createPetalList(int countPetal) {
		List<Petal> listPetal = new LinkedList<>();
		for (int j = 0; j < countPetal; j++) {
			Petal petal = new Petal();
			listPetal.add(petal);
		}
		return listPetal;
	}
}
