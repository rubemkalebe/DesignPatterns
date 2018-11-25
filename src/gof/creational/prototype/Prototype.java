package gof.creational.prototype;

public class Prototype {

	public static void main(String[] args) {
		A3Prototype a3Prototype = new A3Prototype();
		
		CarPrototype a3Sedan = a3Prototype.clone();
		a3Sedan.setPrice(31950.00);
		CarPrototype a3Convertible = a3Prototype.clone();
		a3Convertible.setPrice(38500.00);
		
		System.out.println(a3Sedan.info());
		System.out.println(a3Convertible.info());
	}

}
