package Program;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.printf("Quantity in stock ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Produtc data: " + product);

        System.out.println();
        System.out.println("Enter the number of produtcs to be added in stock: ");
        int quantityUser = sc.nextInt();
        product.addProduct(quantityUser);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of produtcs to be removed in stock: ");
        quantityUser = sc.nextInt();
        product.removeProducts(quantityUser);

        System.out.println();
        System.out.println("Updated data: " + product);
    }
}
