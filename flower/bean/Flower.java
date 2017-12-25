package by.htp.flower.bean;

public class Flower {
	private String title;
	private Bud bud;
	private Stem stem;

	public Flower(String title) {
		this.title = title;
		bud = new Bud(2);
		stem = new Stem(10, 1);
	}

	public String getTitle() {
		return title;
	}

	public Bud getBud() {
		return bud;
	}

	public Stem getStem() {
		return stem;
	}

	public void grow() {
		
		this.stem.setHeight(25);
		this.stem.setWidth(3);
		this.bud.setSize(8);
	}

	public void bloom() {
		
		this.bud.setSize(12);
		this.bud.setColor("yellow");

		this.bud.addFreshLeaves();
	}
	public void zaviat() {
		this.bud.setColor("grey");
		this.bud.remoteLeaves();
	}
}