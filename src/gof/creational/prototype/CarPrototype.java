package gof.creational.prototype;

public abstract class CarPrototype {

	private Double price;
	
	private String model;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public abstract CarPrototype clone();
	
	public abstract String info();
	
}
