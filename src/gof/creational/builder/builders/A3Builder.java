package gof.creational.builder.builders;

public class A3Builder extends CarBuilder {

	@Override
	public void buildModel() {
		this.getCar().setModel("A3 Convertible");
	}

	@Override
	public void buildCompany() {
		this.getCar().setCompany("Audi");
	}

	@Override
	public void buildPrice() {
		this.getCar().setPrice(38500.00);
	}

	@Override
	public void buildYear() {
		this.getCar().setYear(2018);
	}

}
