package Vetores02.exer05;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, posmaior;
        double maior;

        System.out.printf("Quantos numeros vai digitar? ");
        n = sc.nextInt();
        double[] vect = new double[n];

        for (int i= 0;i< vect.length;i++){
            System.out.printf("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        maior = vect[0];
        posmaior = 0;

        System.out.println("MAIOR VALOR:");
        for (int i = 0;i< vect.length;i++)
            if (vect[i] > maior){
                maior = vect[i];
                posmaior = i;
            }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);

} }