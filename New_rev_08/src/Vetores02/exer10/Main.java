package Vetores02.exer10;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos pessoas serao digitadas? \n");
        int n = sc.nextInt();

        double[] altura = new double[n];
        String[] genero = new String[n];

        for(int i = 0; i < n;i++){
            System.out.println("Altura da " + (i+1) + "a pessoa:");
            altura[i] = sc.nextDouble();
            System.out.print("Genero da " + (i+1) + "a pessoa:");
            genero[i] = sc.nextLine();
        }

        double maiorAltura = altura[0];
        double menorAltura = altura[0];
        for (int i = 0; i< n;i++){
            if (altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
            if (altura[i] < menorAltura){
                menorAltura = altura[i];
            }
        }
        double qtdhomens = 0;
        double qtdmulheres = 0;
        double alturafemtotal = 0;
        for (int i=0; i<n; i++) {
            if (genero[i] == "M") {
                qtdhomens++;
            }
            else {
                qtdmulheres++;
                alturafemtotal = alturafemtotal + altura[i];
            }
        }

        double alturafemMedia = alturafemtotal / qtdmulheres;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemMedia);
        System.out.printf("Numero de homens = %d\n", qtdhomens);

    }

}