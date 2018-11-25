package gof.creational.factoryMethod.factory;

import gof.creational.factoryMethod.car.A3;
import gof.creational.factoryMethod.car.Car;

public class A3Factory extends CarFactory {

	private static CarFactory instance;
	
	private A3Factory() {}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new A3Factory();
		}
		return instance;
	}
	
	@Override
	public Car createCar() {
		this.incrementInstancesCounter();
		return new A3();
	}

}
