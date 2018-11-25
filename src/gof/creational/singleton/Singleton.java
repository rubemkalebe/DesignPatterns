package gof.creational.singleton;

import gof.creational.factoryMethod.factory.A3Factory;
import gof.creational.factoryMethod.factory.AvalonFactory;
import gof.creational.factoryMethod.factory.CarFactory;
import gof.creational.factoryMethod.factory.EdgeFactory;
import gof.creational.factoryMethod.factory.SorentoFactory;

public class Singleton {

	public static void main(String[] args ) {
		CarFactory factory = A3Factory.getInstance();
		factory.createCar();
		factory.createCar();
		System.out.println("A3 Factory: " + factory.getInstancesCounter());
		
		factory = AvalonFactory.getInstance();
		factory.createCar();
		factory.createCar();
		System.out.println("Avalon Factory: " + factory.getInstancesCounter());

		factory = EdgeFactory.getInstance();
		factory.createCar();
		System.out.println("Edge Factory: " + factory.getInstancesCounter());

		factory = SorentoFactory.getInstance();
		System.out.println("Sorento Factory: " + factory.getInstancesCounter());
		
		factory = A3Factory.getInstance();
		factory.createCar();
		System.out.println("A3 Factory: " + factory.getInstancesCounter());
	}
	
}
