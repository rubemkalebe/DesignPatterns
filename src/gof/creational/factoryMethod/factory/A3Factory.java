package gof.creational.factoryMethod.factory;

import gof.creational.factoryMethod.car.A3;
import gof.creational.factoryMethod.car.Car;

public class A3Factory implements CarFactory {

	@Override
	public Car createCar() {
		return new A3();
	}

}
