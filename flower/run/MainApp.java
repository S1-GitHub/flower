package by.htp.flower.run;

import by.htp.flower.bean.Bud;
import by.htp.flower.bean.Flower;
import by.htp.flower.bean.Leaf;

public class MainApp {

	// —оздать объект класса ÷веток, использу€ классы Ћепесток, Ѕутон.
	// ћетоды: расцвести, зав€ть, вывести на консоль цвет бутона.

	public static void main(String[] args) {

		Flower flower = new Flower("Rose");
		printFlower("Flower born", flower);
		
		flower.grow();
		printFlower("Flower grown", flower);
		
		flower.bloom();
		printBloomingFlower(flower);
		
		flower.zaviat();
		printZaviatFlower(flower);

	}
	private static void printBloomingFlower(Flower flower) {
		System.out.println("This flower is blooming!!!");
		System.out.println("new bud color "+flower.getBud().getColor());
		printBudLeaves(flower.getBud());
	}
		private static void printZaviatFlower(Flower flower) {
			System.out.println("This flower is zavial!..");
			System.out.println("New bud color "+flower.getBud().getColor());
			printBudLeaves(flower.getBud());
	}
	
	private static void printBudLeaves(Bud bud) {
		Leaf[] leaves=bud.getLeaves();
		if(bud!=null&&leaves!=null) {
			for(Leaf leaf:leaves) {
				System.out.println("Leaf color, shape: "+leaf.getColor() +","+leaf.getShape());
			}
		}
	}

	private static void printFlower(String message, Flower flower) {
		System.out.println(message);
		System.out.println("Flower " + flower.getTitle());
		System.out.println("stem height, width " + flower.getStem().getHeight()+","+flower.getStem().getWidth());
		System.out.println("bud size, color " + flower.getBud().getSize()+","+flower.getBud().getColor());
	}

}