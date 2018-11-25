package gof.creational.builder;

import gof.creational.builder.builders.A3Builder;
import gof.creational.builder.builders.Car;
import gof.creational.builder.builders.R8Builder;
import gof.creational.builder.director.DealershipDirector;

public class Builder {

	public static void main(String[] args) {
		DealershipDirector director = new DealershipDirector(new A3Builder());
		Car car = director.buildCar();
		System.out.println(car);
		
		director = new DealershipDirector(new R8Builder());
		car = director.buildCar();
		System.out.println(car);
	}

}
