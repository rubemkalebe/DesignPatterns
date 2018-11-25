package gof.creational.factoryMethod.factory;

import gof.creational.factoryMethod.car.Car;

public abstract class CarFactory {

	private Integer counter = 0;
	
	public Integer getInstancesCounter() {
		return counter;
	}
	
	protected Integer incrementInstancesCounter() {
		return ++counter;
	}
	
	public abstract Car createCar();
	
}
