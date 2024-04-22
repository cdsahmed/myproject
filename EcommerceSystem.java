/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.product;

/**
 *
 * @author TOSHIBA
 */
import java.util.Scanner;

public class EcommerceSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
ElectronicProduct e1=new ElectronicProduct(1,"smartphone",599.9f,"samsung",1);
	ClothingProduct c1=new ClothingProduct(2,"Tshirt",19.99f,"medium","cotton");
	BookProduct b1=new BookProduct(3,"oop",39.99f,"O'Reilly","X publications");
        System.out.println("Welcome to the E-Commerce System!");
        System.out.println("Please enter your id:");
        int customerId = Math.abs(input.nextInt());
      input.nextLine();
        System.out.println("Please enter your name:");
        String name = input.nextLine();

        System.out.println("Please enter your address:");
        String address = input.nextLine();
   
        Customer customer = new Customer(customerId, name, address);

        System.out.println("How many products you want to add to your cart?");
        int nProducts = Math.abs(input.nextInt());

        Cart cart = new Cart(customer.getCustomerId(), nProducts);

        for (int i = 0; i < nProducts; i++) {
            System.out.println("Which product would you like to add?");
            System.out.println("1- Smartphone");
            System.out.println("2- T-Shirt");
            System.out.println("3- Book");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    cart.addProduct(e1,i);
                    break;
                case 2:
                    cart.addProduct(c1,i);
                    break;
                case 3:
                    cart.addProduct(b1,i);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        float totalPrice = cart.calculatePrice();
        System.out.println("Your total is $" + totalPrice + ". Would you like to place the order?1-yes 2-no");

      int orderChoice =input.nextInt();
             if (orderChoice == 1) {
            cart.placeOrder();
            Order order = new Order(customerId, 1, cart.getProducts(), totalPrice);
            order.printOrderInfo();
        }
             else {
            System.out.println("Order not placed.");
        }
    }
}
    

	