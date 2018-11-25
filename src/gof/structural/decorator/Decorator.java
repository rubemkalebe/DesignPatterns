package gof.structural.decorator;

public class Decorator {

	public static void info(Coffee coffee) {
		System.out.println("Ingredients: " + coffee.getIngredients()
			+ "; Cost: " + coffee.getCost());
	}
	
	public static void main(String[] args) {
		Coffee coffee = new SimpleCoffee();
		info(coffee);
		
		coffee = new Milk(coffee);
		info(coffee);
		
		coffee = new Sprinkles(coffee);
		info(coffee);
		
		coffee = new Chocolate(coffee);
		info(coffee);
	}
	
}
