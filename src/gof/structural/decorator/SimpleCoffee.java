package gof.structural.decorator;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleCoffee extends Coffee {
	
	public SimpleCoffee() {
		this.setCost(1.0);
		this.setIngredients(Stream.of("Coffee").collect(Collectors.toList()));
	}
	
}
