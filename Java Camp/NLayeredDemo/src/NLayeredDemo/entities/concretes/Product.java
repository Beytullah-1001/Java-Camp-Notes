package NLayeredDemo.entities.concretes;

import NLayeredDemo.entities.abstracts.Entity;

public class Product implements Entity {
	private int id;
	private int categoryId;
	private String productName;
	private double unitPrice;
	private int unitInStock;
	
	public Product() {
		
	}
	public Product(int id, int categoryId, String productName, double unitPrice, int unitInStock) {
		
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitInStock = unitInStock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getUnitInStock() {
		return unitInStock;
	}
	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

}
