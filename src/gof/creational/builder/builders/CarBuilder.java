package gof.creational.builder.builders;

public abstract class CarBuilder {

	private Car car;
	
	public CarBuilder() {
		car = new Car();
	}
	
	public Car getCar() {
		return car;
	}
	
	public abstract void buildModel();
	
	public abstract void buildCompany();
	
	public abstract void buildPrice();
	
	public abstract void buildYear();
	
}
