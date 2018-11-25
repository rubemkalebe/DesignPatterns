package gof.creational.singleton;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import gof.creational.factoryMethod.factory.A3Factory;
import gof.creational.factoryMethod.factory.AvalonFactory;
import gof.creational.factoryMethod.factory.CarFactory;
import gof.creational.factoryMethod.factory.EdgeFactory;
import gof.creational.factoryMethod.factory.SorentoFactory;

public class SingletonTest {

	@Test
	public void test() {
		CarFactory factory = A3Factory.getInstance();
		factory.createCar();
		factory.createCar();
		assertEquals(2, factory.getInstancesCounter().intValue());
		
		factory = AvalonFactory.getInstance();
		factory.createCar();
		factory.createCar();
		assertEquals(2, factory.getInstancesCounter().intValue());

		factory = EdgeFactory.getInstance();
		factory.createCar();
		assertEquals(1, factory.getInstancesCounter().intValue());

		factory = SorentoFactory.getInstance();
		assertEquals(0, factory.getInstancesCounter().intValue());
		
		factory = A3Factory.getInstance();
		factory.createCar();
		assertEquals(3, factory.getInstancesCounter().intValue());
	}
	
}
