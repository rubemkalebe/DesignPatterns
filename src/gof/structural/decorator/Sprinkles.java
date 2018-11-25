package gof.structural.decorator;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sprinkles extends CoffeeDecorator {

	public Sprinkles(Coffee deCoffee) {
		super(deCoffee);
		super.setCost(0.2);
		super.setIngredients(Stream.of("Sprinkles").collect(Collectors.toList()));
	}
	
}
