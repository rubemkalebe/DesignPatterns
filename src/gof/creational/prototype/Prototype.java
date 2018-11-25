package gof.creational.prototype;

public class Prototype {

	public static void main(String[] args) {
		CarPrototype a3Sedan = new A3Prototype();
		a3Sedan.setPrice(31950.00);
		CarPrototype a3Convertible = a3Sedan.clone();
		a3Convertible.setPrice(38500.00);
		
		System.out.println(a3Sedan.info());
		System.out.println(a3Convertible.info());
	}

}
