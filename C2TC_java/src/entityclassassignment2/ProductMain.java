package entityclassassignment2;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("\nEnter details for Product " + (i + 1) + ":");

            System.out.print("Product ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Product Name: ");
            String name = scanner.nextLine();

            System.out.print("Product Price: ");
            double price = scanner.nextDouble();

            products[i] = new Product(id, name, price);
        }

        scanner.close();

        System.out.println("\nCollected Product Details:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

