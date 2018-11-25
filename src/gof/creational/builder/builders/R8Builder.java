package gof.creational.builder.builders;

public class R8Builder extends CarBuilder {

	@Override
	public void buildModel() {
		this.getCar().setModel("R8 Coupe");
	}

	@Override
	public void buildCompany() {
		this.getCar().setCompany("Audi");
	}

	@Override
	public void buildPrice() {
		this.getCar().setPrice(164900.00);
	}

	@Override
	public void buildYear() {
		this.getCar().setYear(2018);
	}

}
