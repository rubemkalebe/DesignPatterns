package gof.creational.factoryMethod.factory;

import gof.creational.factoryMethod.car.Car;
import gof.creational.factoryMethod.car.Sorento;

public class SorentoFactory extends CarFactory {

	private static CarFactory instance;
	
	private SorentoFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new SorentoFactory();
		}
		return instance;
	}
	
	@Override
	public Car createCar() {
		this.incrementInstancesCounter();
		return new Sorento();
	}

}
