package model;

import java.io.Serializable;

public class Product implements Serializable{

    private String code, name;
    private String price;
    private String type;
    private String color, quantity, sold;

    public Product(String code, String name, String price, String type, String color, String quantity, String sold) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.type = type;
        this.color = color;
        this.quantity = quantity;
        this.sold = sold;
    }

    public Product(String code, String name, String price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getSold() {
        return sold;
    }

    public void setSold(String sold) {
        this.sold = sold;
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
