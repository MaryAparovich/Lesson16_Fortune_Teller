package by.htp.collections.flower;

import java.util.List;

public abstract class Flower {

	private String title;
	private List<Petal> petals;

	public Flower(String title, List<Petal> petals) {
		super();
		this.title = title;
		this.petals = petals;
	}

	public List<Petal> getPetals() {
		return petals;
	}

	public String getTitle() {
		return title;
	}
}
