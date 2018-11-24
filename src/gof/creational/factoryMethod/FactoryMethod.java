package gof.creational.factoryMethod;

import gof.creational.factoryMethod.car.Car;
import gof.creational.factoryMethod.factory.A3Factory;
import gof.creational.factoryMethod.factory.AvalonFactory;
import gof.creational.factoryMethod.factory.CarFactory;
import gof.creational.factoryMethod.factory.EdgeFactory;
import gof.creational.factoryMethod.factory.SorentoFactory;

public class FactoryMethod {

	public static void main(String[] args ) {
		CarFactory factory = new A3Factory();
		Car car = factory.createCar();
		System.out.println(car.info());
		System.out.println();

		factory = new AvalonFactory();
		car = factory.createCar();
		System.out.println(car.info());
		System.out.println();

		factory = new EdgeFactory();
		car = factory.createCar();
		System.out.println(car.info());
		System.out.println();

		factory = new SorentoFactory();
		car = factory.createCar();
		System.out.println(car.info());
		System.out.println();
	}
	
}
