package gof.creational.factoryMethod.factory;

import gof.creational.factoryMethod.car.Car;
import gof.creational.factoryMethod.car.Sorento;

public class SorentoFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Sorento();
	}

}
