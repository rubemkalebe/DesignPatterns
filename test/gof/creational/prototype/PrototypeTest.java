package gof.creational.prototype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrototypeTest {

	@Test
	public void test() {
		CarPrototype a3Sedan = new A3Prototype();
		a3Sedan.setPrice(31950.00);
		CarPrototype a3Convertible = a3Sedan.clone();
		a3Convertible.setPrice(38500.00);
		
		assertEquals("A3: 31950.0", a3Sedan.info());
		assertEquals("A3: 38500.0", a3Convertible.info());
	}
			
}
