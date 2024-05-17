package ConversorEstatico;


import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double total = sc.nextDouble();
        double result = CurrencyConverter.dollarToReal(total,dollarPrice);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);

    }

}