package gof.creational.factoryMethod.factory;

import gof.creational.factoryMethod.car.Car;
import gof.creational.factoryMethod.car.Edge;

public class EdgeFactory extends CarFactory {

	private static CarFactory instance;
	
	private EdgeFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new EdgeFactory();
		}
		return instance;
	}
	
	@Override
	public Car createCar() {
		this.incrementInstancesCounter();
		return new Edge();
	}

}
