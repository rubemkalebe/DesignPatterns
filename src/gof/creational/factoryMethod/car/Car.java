package gof.creational.factoryMethod.car;

public abstract class Car {

	private String model;
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String info() {
		return this.getModel();
	}
	
}
