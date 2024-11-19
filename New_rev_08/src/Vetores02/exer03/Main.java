package Vetores02.exer03;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.printf("Quantos pessoas serao digitadas? \n");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];

        for(int i = 0; i < n;i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        int maisVelha = 0;
        int indiceMaisVelha = 0;
        for (int i = 0; i< n;i++){
            if (idade[i] > maisVelha){
                maisVelha = idade[i];
                indiceMaisVelha = i;
            }
        }

        System.out.println();
        System.out.printf("PESSOA MAIS VELHA: %s (idade: %d)\n", nome[indiceMaisVelha], maisVelha);


        }

}