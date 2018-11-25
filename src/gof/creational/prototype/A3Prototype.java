package gof.creational.prototype;

public class A3Prototype extends CarPrototype {

	public A3Prototype() {
		this.setModel("A3");
		this.setPrice(0.0);
	}
	
	public A3Prototype(A3Prototype a3Prototype) {
		this.setModel(a3Prototype.getModel());
		this.setPrice(a3Prototype.getPrice());
	}
	
	@Override
	public CarPrototype clone() {
		return new A3Prototype(this);
	}

	@Override
	public String info() {
		return this.getModel() + ": " + this.getPrice();
	}

}
