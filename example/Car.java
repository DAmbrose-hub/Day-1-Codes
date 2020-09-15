package example;

import java.util.List;

public class Car {

	private float price;
	private int wheel;
	List<Wheel> wheels;
	private EngineType etype;

	public Car(List<Wheel> wheels, float price, EngineType etype) {
		super();
		this.wheels = wheels;
		this.price = price;
		this.etype = etype;
	}

	public float getPrice() {
		return price;
	}

	public EngineType getEtype() {
		return etype;
	}

}
