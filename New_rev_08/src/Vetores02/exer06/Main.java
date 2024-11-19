package Vetores02.exer06;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, a, b;

        System.out.printf("Quantos numeros vai digitar? ");
        n = sc.nextInt();
        Soma[] vect = new Soma[n];
        System.out.println("Digite os valores do vetor A: ");

        for (int i = 0;i < n;i++){
            vect[i] = new Soma();
            a = sc.nextInt();
            vect[i].setA(a);
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0;i < n;i++){
            b = sc.nextInt();
            vect[i].setB(b);
        }
        System.out.println("VALOR RESULTANTE: ");
        for (int i = 0;i<n;i++){
            System.out.println(vect[i].totalValueVect());

        }




} }