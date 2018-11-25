package gof.structural.decorator;

import java.util.List;

public abstract class Coffee {

	private Double cost;
	
	private List<String> ingredients;

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
	
}
