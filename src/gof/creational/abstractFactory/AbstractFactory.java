package gof.creational.abstractFactory;

import gof.creational.abstractFactory.car.convertible.Convertible;
import gof.creational.abstractFactory.car.coupe.Coupe;
import gof.creational.abstractFactory.factory.AudiFactory;
import gof.creational.abstractFactory.factory.CarFactory;
import gof.creational.abstractFactory.factory.MercedesFactory;

public class AbstractFactory {

	public static void main(String[] args) {
		CarFactory factory = new AudiFactory();
		Coupe coupe = factory.createCoupe();
		Convertible convertible = factory.createConvertible();
		
		System.out.println(coupe.coupeInfo());
		System.out.println(convertible.convertibleInfo());
		System.out.println();
		
		factory = new MercedesFactory();
		coupe = factory.createCoupe();
		convertible = factory.createConvertible();
		
		System.out.println(coupe.coupeInfo());
		System.out.println(convertible.convertibleInfo());
		System.out.println();
	}
	
}
