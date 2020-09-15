package example;

import java.util.*;

import example.EngineType;

public class Main {

	public static void main(String[] args) {
		List<Wheel> wheels = new ArrayList<Wheel>();
		wheels.add(new Wheel(8.5f, 20, 15, 6000.00f));
		wheels.add(new Wheel(7.5f, 18, 14, 7000.00f));
		wheels.add(new Wheel(8.5f, 16, 16, 8000.00f));
		wheels.add(new Wheel(8.5f, 19, 14, 6500.00f));
		Car c = new Car(wheels, 100, new EngineType(ET.PETROL));
		System.out.println("\nCAR PRICE IS :" + c.getPrice());
		System.out.println("\nCAR ENGINE TYPE IS : " + c.getEtype().getEtype());
		System.out.println("\nCAR'S WHEELS INFO IS :");
		int count = 0;
		for (Wheel w : c.wheels) {
			count++;
			System.out.println("\nWheel " + count + ":");
			System.out.println("Diameter : " + w.getDiameter());
			System.out.println("Price : " + w.getPrice());
			System.out.println("Thickness : " + w.getThickness());
			System.out.println("Weight : " + w.getWeight());

		}

	}

	@Override
	public String toString() {
		return "Main []";
	}

}
