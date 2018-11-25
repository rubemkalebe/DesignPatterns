package gof.creational.factoryMethod;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import gof.creational.factoryMethod.car.Car;
import gof.creational.factoryMethod.factory.A3Factory;
import gof.creational.factoryMethod.factory.AvalonFactory;
import gof.creational.factoryMethod.factory.CarFactory;
import gof.creational.factoryMethod.factory.EdgeFactory;
import gof.creational.factoryMethod.factory.SorentoFactory;

public class FactoryMethodTest {

	@Test
	public void createA3() {
		CarFactory carFactory = A3Factory.getInstance();
		Car car = carFactory.createCar();
		assertEquals("A3", car.info());
	}
	
	@Test
	public void createAvalon() {
		CarFactory carFactory = AvalonFactory.getInstance();
		Car car = carFactory.createCar();
		assertEquals("Avalon", car.info());
	}
	
	@Test
	public void createEdge() {
		CarFactory carFactory = EdgeFactory.getInstance();
		Car car = carFactory.createCar();
		assertEquals("Edge", car.info());
	}
	
	@Test
	public void createSorento() {
		CarFactory carFactory = SorentoFactory.getInstance();
		Car car = carFactory.createCar();
		assertEquals("Sorento", car.info());
	}
	
}
