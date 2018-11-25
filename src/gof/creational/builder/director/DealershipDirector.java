package gof.creational.builder.director;

import gof.creational.builder.builders.Car;
import gof.creational.builder.builders.CarBuilder;

public class DealershipDirector {

	private CarBuilder carBuilder;
	
	public DealershipDirector(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}
	
	public Car getCar() {
		return this.carBuilder.getCar();
	}
	
	public Car buildCar() {
		this.carBuilder.buildCompany();
		this.carBuilder.buildModel();
		this.carBuilder.buildPrice();
		this.carBuilder.buildYear();
		return this.getCar();
	}
	
}
