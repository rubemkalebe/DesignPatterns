package gof.creational.builder.builders;

public class Car {

	private String model;
	
	private String company;
	
	private Double price;
	
	private Integer year;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", company=" + company + ", price=" + price + ", year=" + year + "]";
	}
	
}
