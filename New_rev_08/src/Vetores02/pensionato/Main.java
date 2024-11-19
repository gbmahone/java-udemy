package Vetores02.pensionato;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];
        System.out.printf("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1;i<=n;i++){
            System.out.println();
            System.out.println("Rent #" + i + ";");
            System.out.printf("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++){
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }









} }