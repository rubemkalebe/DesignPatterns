package gof.creational.abstractFactory.factory;

import gof.creational.abstractFactory.car.convertible.A3;
import gof.creational.abstractFactory.car.convertible.Convertible;
import gof.creational.abstractFactory.car.coupe.Coupe;
import gof.creational.abstractFactory.car.coupe.R8;
import gof.creational.abstractFactory.factory.CarFactory;

public class AudiFactory implements CarFactory {

	@Override
	public Coupe createCoupe() {
		return new R8();
	}

	@Override
	public Convertible createConvertible() {
		return new A3();
	}

}
