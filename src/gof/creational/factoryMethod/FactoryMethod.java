package gof.creational.factoryMethod;

import gof.creational.factoryMethod.car.Car;
import gof.creational.factoryMethod.factory.A3Factory;
import gof.creational.factoryMethod.factory.AvalonFactory;
import gof.creational.factoryMethod.factory.CarFactory;
import gof.creational.factoryMethod.factory.EdgeFactory;
import gof.creational.factoryMethod.factory.SorentoFactory;

public class FactoryMethod {

	public static void main(String[] args ) {
		CarFactory factory = A3Factory.getInstance();
		Car car = factory.createCar();
		System.out.println(car.info());
		System.out.println();

		factory = AvalonFactory.getInstance();
		car = factory.createCar();
		System.out.println(car.info());
		System.out.println();

		factory = EdgeFactory.getInstance();
		car = factory.createCar();
		System.out.println(car.info());
		System.out.println();

		factory = SorentoFactory.getInstance();
		car = factory.createCar();
		System.out.println(car.info());
		System.out.println();
	}
	
}
