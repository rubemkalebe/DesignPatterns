package gof.creational.factoryMethod.factory;

import gof.creational.factoryMethod.car.Car;
import gof.creational.factoryMethod.car.Edge;

public class EdgeFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Edge();
	}

}
