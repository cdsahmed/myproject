/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.product;

/**
 *
 * @author TOSHIBA
 */

public class Product {
    protected int productId;
    protected String name;
    protected float price;
    public Product(int productId, String name, float price) {
        this.productId = Math.abs(productId); 
        this.name = name;
        this.price = Math.abs(price); 
    }
  public void setProductId(int productId) {
        this.productId = Math.abs(productId);
    }

    public int getProductId() {
        return productId;
    }
 public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
 public void setPrice(float price) {
        this.price = Math.abs(price);
    }
    public float getPrice() {
        return price;
    }

}



