package gof.creational.factoryMethod.factory;

import gof.creational.factoryMethod.car.Avalon;
import gof.creational.factoryMethod.car.Car;

public class AvalonFactory extends CarFactory {

	private static CarFactory instance;
	
	private AvalonFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new AvalonFactory();
		}
		return instance;
	}
	
	@Override
	public Car createCar() {
		this.incrementInstancesCounter();
		return new Avalon();
	}

}
