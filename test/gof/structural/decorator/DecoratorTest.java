package gof.structural.decorator;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void test() {
		Coffee coffee = new SimpleCoffee();
		assertEquals(1.0, coffee.getCost(), 0.0);
		assertArrayEquals(
				Stream.of("Coffee").collect(Collectors.toList()).toArray(),
				coffee.getIngredients().toArray()
		);
		
		coffee = new Milk(coffee);
		assertEquals(1.5, coffee.getCost(), 0.0);
		assertArrayEquals(
				Stream.of("Coffee", "Milk").collect(Collectors.toList()).toArray(),
				coffee.getIngredients().toArray()
		);
		
		coffee = new Sprinkles(coffee);
		assertEquals(1.7, coffee.getCost(), 0.0);
		assertArrayEquals(
				Stream.of("Coffee", "Milk", "Sprinkles").collect(Collectors.toList()).toArray(),
				coffee.getIngredients().toArray()
		);
		
		coffee = new Chocolate(coffee);
		assertEquals(2.5, coffee.getCost(), 0.0);
		assertArrayEquals(
				Stream.of("Coffee", "Milk", "Sprinkles", "Chocolate").collect(Collectors.toList()).toArray(),
				coffee.getIngredients().toArray()
		);
	}
	
}
