/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.product;

/**
 *
 * @author TOSHIBA
 */
public class Cart {
    private int customerId;
   private int nProducts;
     private Product[] products;
    public Cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId); 
        this.nProducts = Math.abs(nProducts); 
        this.products = new Product[nProducts];
    }
  public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }
    public int getCustomerId() {
        return customerId;
    }
 public void setNProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
    }
    public int getNProducts() {
        return nProducts;
    }
  public void setProducts(Product[] products) {
        this.products = products;
    }
    public Product[] getProducts() {
        return products;
    }
public void addProduct(Product product, int index) {
  if (index >= 0 && index < nProducts) {
      products[index] = product;
}else {
System.out.println("Invalid index.");
      } 
}
public void removeProduct(int index) {
       if (index >= 0&& index < nProducts) {
                    products[index] = null;
                }else{
                System.out.println("invalid index");
            }
        }

public float calculatePrice() {
        float totalPrice = 0;
        for (int i = 0; i < nProducts; i++) {
            totalPrice += products[i].getPrice();
        }
        return totalPrice;
    }
    public void placeOrder() {
        System.out.println("Here's your order summary.");
    }
}    

