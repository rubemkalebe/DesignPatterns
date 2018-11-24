package gof.creational.factoryMethod.factory;

import gof.creational.factoryMethod.car.Avalon;
import gof.creational.factoryMethod.car.Car;

public class AvalonFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Avalon();
	}

}
