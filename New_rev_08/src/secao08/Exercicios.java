package secao08;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        Student student = new Student(name, nota1, nota2, nota3);

        System.out.printf("FINAL GRADE: %.2f%n", student.notaFinal());

        if (student.notaFinal() < 60){
            System.out.println("FAILED");
            System.out.printf("MISSING " + student.missingPoints() + " POINTS");
        }else {
            System.out.printf("PASS");
        }
    }
}
