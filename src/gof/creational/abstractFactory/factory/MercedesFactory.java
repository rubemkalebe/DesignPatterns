package gof.creational.abstractFactory.factory;

import gof.creational.abstractFactory.car.convertible.Convertible;
import gof.creational.abstractFactory.car.convertible.SLC43;
import gof.creational.abstractFactory.car.coupe.Coupe;
import gof.creational.abstractFactory.car.coupe.GLECoupe;
import gof.creational.abstractFactory.factory.CarFactory;

public class MercedesFactory implements CarFactory {

	@Override
	public Coupe createCoupe() {
		return new GLECoupe();
	}

	@Override
	public Convertible createConvertible() {
		return new SLC43();
	}



}
