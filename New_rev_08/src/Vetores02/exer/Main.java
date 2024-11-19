package Vetores02.exer;


import Vetores02.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.printf("Quantos numeros vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i= 0;i< vect.length;i++){
            System.out.printf("Digite um numero: \n");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0;i< vect.length;i++)
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }



} }