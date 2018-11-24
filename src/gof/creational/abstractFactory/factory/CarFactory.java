package gof.creational.abstractFactory.factory;

import gof.creational.abstractFactory.car.convertible.Convertible;
import gof.creational.abstractFactory.car.coupe.Coupe;

public interface CarFactory {

	public Coupe createCoupe();
	
	public Convertible createConvertible();
	
}
