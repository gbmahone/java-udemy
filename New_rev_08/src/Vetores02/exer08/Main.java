package Vetores02.exer08;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, npares;
        double media, parMedia, soma;

        System.out.printf("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();
        double[] vect = new double[n];

        for (int i= 0;i< vect.length;i++){
            System.out.printf("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        media = 0;
        npares =0;
        soma = 0;
        for (int i = 0;i<n;i++){
            if (vect[i] % 2 ==0) {
                soma += vect[i];
                npares++;
            }
        }

        if (npares == 0){
            System.out.println("NENHUM NUMERO PAR");
        }
        media = soma / npares;
        System.out.println();
        System.out.printf("MÉDIA DOS PARES = %.2f\n", media);




} }