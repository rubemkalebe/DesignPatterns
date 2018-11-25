package gof.structural.decorator;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chocolate extends CoffeeDecorator {

	public Chocolate(Coffee deCoffee) {
		super(deCoffee);
		super.setCost(0.8);
		super.setIngredients(Stream.of("Chocolate").collect(Collectors.toList()));
	}
	
}
