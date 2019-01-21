package model;

public class Product {
	private String code, name;
	private String price;
	
	public Product(String code, String name, String price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}
	public Product() {
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
