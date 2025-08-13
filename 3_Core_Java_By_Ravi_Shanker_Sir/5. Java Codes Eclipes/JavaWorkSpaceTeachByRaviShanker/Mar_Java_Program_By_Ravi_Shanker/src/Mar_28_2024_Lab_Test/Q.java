package Mar_28_2024_Lab_Test;

//Define the Product Class:
//
//
//
//Create a class named Product.
//
//Include attributes for the product's name and price.
//
//Implement a constructor to initialize these attributes.
//
//Provide getter methods to access the product's name and price.
//
//Create the ProductProcessor Class:
//
//
//
//Create a class named ProductProcessor.
//
//Inside this class, define the main method.
//
//Create Products Array:
//
//
//
//In the main method, define an array of Product objects.
//
//Initialize the array with several Product objects, each representing a different product.
//
//Define the Consumer:
//
//
//
//Define a Consumer < Product >  interface.
//
//Implement the accept method of the Consumer interface to process each product.
//
//Process Products using Consumer:
//
//
//
//Write a method named processProducts that takes an array of products and a consumer as parameters.
//
//Inside the processProducts method, iterate through the array of products.
//
//Apply the consumer to each product using the accept method of the Consumer interface.
//
//Call the processProducts Method:
//
//
//
//In the main method, call the processProducts method, passing the array of products and the consumer as arguments.





import java.util.function.Consumer;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class Q {
    public static void main(String[] args) {
        Product[] products = {
            new Product("Laptop", 999.99),
            new Product("Smartphone", 699.99),
            new Product("Headphones", 149.99)
        };

        Consumer<Product> productConsumer = product -> System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice());

        processProducts(products, productConsumer);
    }

    public static void processProducts(Product[] products, Consumer<Product> consumer) {
        for (Product product : products) {
            consumer.accept(product);
        }
    }
}
