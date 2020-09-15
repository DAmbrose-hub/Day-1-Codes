package example;

enum ET {
	DIESEL, PETROL
};

public class EngineType {

	private ET etype;

	public EngineType(ET etype) {
		super();
		this.etype = etype;
	}

	public ET getEtype() {
		return etype;
	}

}
