package gof.creational.abstractFactory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import gof.creational.abstractFactory.car.convertible.Convertible;
import gof.creational.abstractFactory.car.coupe.Coupe;
import gof.creational.abstractFactory.factory.AudiFactory;
import gof.creational.abstractFactory.factory.CarFactory;
import gof.creational.abstractFactory.factory.MercedesFactory;

public class AbstractFactoryTest {

	@Test
	public void audiTest() {
		CarFactory factory = new AudiFactory();
		Coupe coupe = factory.createCoupe();
		Convertible convertible = factory.createConvertible();
		
		assertEquals("Model: R8; Type: Coupe", coupe.coupeInfo());
		assertEquals("Model: A3; Type: Convertible", convertible.convertibleInfo());
	}
	
	@Test
	public void mercedesTest() {
		CarFactory factory = new MercedesFactory();
		Coupe coupe = factory.createCoupe();
		Convertible convertible = factory.createConvertible();
		
		assertEquals("Model: GLE Coupe; Type: Coupe", coupe.coupeInfo());
		assertEquals("Model: SLC 43; Type: Convertible", convertible.convertibleInfo());
	}
		
}
