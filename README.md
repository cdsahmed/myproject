#This is a Java superclass that represents a generic product.

## Attributes

- productId: Positive integer (will be converted to absolute value if negative)
- name: String
- price: Positive float (will be converted to absolute value if negative)

## Methods

- getProductId(): Returns the productId of the product.
- setProductId(int productId): Sets the productId of the product.
- getName(): Returns the name of the product.
- setName(String name): Sets the name of the product.
- getPrice(): Returns the price of the product.
- setPrice(float price): Sets the price of the product.

## Usage

1. Instantiate a new Product object.
2. Set the attributes using the setters methods and grtting them using getter methods
and so on with the other class
This Java project implements a hierarchical structure for managing products, customers, shopping carts, and orders within an e-commerce system. The superclass Product defines generic product attributes and methods, while subclasses ElectronicProduct, ClothingProduct, and BookProduct specialize in electronic, clothing, and book products respectively. The Customer class stores customer information, and the Cart class handles shopping cart operations. Orders are managed by the Order class, and the EcommerceSystem class serves as the entry point, demonstrating the usage of the other classes through user interaction.
