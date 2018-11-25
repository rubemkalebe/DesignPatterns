package gof.structural.decorator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class CoffeeDecorator extends Coffee {

	private Coffee decoratedCoffee;
	
	public CoffeeDecorator(Coffee deCoffee) {
		this.decoratedCoffee = deCoffee;
	}
	
	@Override
	public Double getCost() {
		return this.decoratedCoffee.getCost() + super.getCost();
	}
	
	@Override
	public List<String> getIngredients() {
		return Stream.concat(this.decoratedCoffee.getIngredients().stream(), super.getIngredients().stream())
				.collect(Collectors.toList());
	}
}
