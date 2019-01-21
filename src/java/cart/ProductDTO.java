package cart;

import java.io.Serializable;

import model.*;

public class ProductDTO implements Serializable{
	private Product sanpham;
	private int quantity;
	public ProductDTO() {
		
	}
	public ProductDTO(Product sp) {
		this.sanpham = sp;
		this.quantity = 1;
	}
	public Product getSanpham() {
		return sanpham;
	}
	public void setSanpham(Product sanpham) {
		this.sanpham = sanpham;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
