package gof.structural.decorator;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Milk extends CoffeeDecorator {

	public Milk(Coffee deCoffee) {
		super(deCoffee);
		super.setCost(0.5);
		super.setIngredients(Stream.of("Milk").collect(Collectors.toList()));
	}
	
}
