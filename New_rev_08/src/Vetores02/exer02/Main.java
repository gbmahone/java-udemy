package Vetores02.exer02;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos numeros voce vai digitar? \n");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i =0; i< vect.length;i++){
            System.out.printf("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        System.out.printf("VALORES = ");

        for (int i = 0; i<vect.length;i++){
            System.out.printf("%.1f  ", vect[i]);

        }
        double sum =0.0;
        for (int i =0; i< vect.length;i++){
            sum += vect[i];
        }

        System.out.printf("\nSOMA = %.2f\n",sum);

        double media = sum / n;

        System.out.printf("MÉDIA = %.2f\n", media);


} }