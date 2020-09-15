package example;

public class Wheel {

	private float thickness;
	private int weight;
	private int diameter;
	private float price;

	public Wheel(float d, int weight, int diameter, float p) {
		super();
		this.thickness = d;
		this.weight = weight;
		this.diameter = diameter;
		this.price = p;
	}

	public float getThickness() {
		return thickness;
	}

	public int getWeight() {
		return weight;
	}

	public int getDiameter() {
		return diameter;
	}

	public float getPrice() {
		return price;
	}
}
