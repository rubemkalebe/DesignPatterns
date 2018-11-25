package gof.creational.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import gof.creational.builder.builders.A3Builder;
import gof.creational.builder.builders.Car;
import gof.creational.builder.builders.R8Builder;
import gof.creational.builder.director.DealershipDirector;

public class BuilderTest {

	@Test
	public void a3Test() {
		DealershipDirector director = new DealershipDirector(new A3Builder());
		Car car = director.buildCar();
		assertEquals("Car [model=A3 Convertible, company=Audi, price=38500.0, year=2018]",
				car.toString());
	}
	
	@Test
	public void r8Test() {
		DealershipDirector director = new DealershipDirector(new R8Builder());
		Car car = director.buildCar();
		assertEquals("Car [model=R8 Coupe, company=Audi, price=164900.0, year=2018]",
				car.toString());
	}
		
}
