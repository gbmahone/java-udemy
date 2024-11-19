package Vetores02.exer07;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double media, abaixo, soma;

        System.out.printf("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();
        double[] vect = new double[n];

        for (int i= 0;i< vect.length;i++){
            System.out.printf("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        media = 0;
        abaixo = 0;
        soma = 0;
        for (int i = 0;i<n;i++){
            soma += vect[i];
        }
        media = soma / n;
        System.out.println();
        System.out.printf("MÉDIA = %.2f\n", media);

        System.out.println("Elementos abaixo da média: ");

        for (int i = 0;i< n;i++)
            if (vect[i] < media){
                abaixo = vect[i];
                System.out.println(abaixo);
            }


} }