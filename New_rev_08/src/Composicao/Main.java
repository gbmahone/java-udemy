package Composicao;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.println("Level: ");
        String workerLevel = sc.nextLine();
        System.out.println("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
        // o WorkerLevel precisa colocar o .valueOf para conectar a classe workerLevel com a variavel descrita no main
        // associado a esse objeto worker vai ter a instanciação do departament
        // eu coloco new no departament porque ele é outro objeto, por isso uso new no Worker e no Department

        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Enter contrat #" + i + "data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hour): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
            /// a linha 45 faz o contrato ser associado dentro do trabalhador
            // pra receber os dados da data eu preciso do objeto "Date" e instanciar o SimpleDateFormat pra usar uma máscara
            // de como eu quero receber os dados da data ex: "dd/MM/yyyy"
        }

        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        // "Integer" = estamos convertendo a string em int, o do mês iniciando no 0 até 2, e o ano iniciando do 3 em diante
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        //associando o worker ao departamento e só depois chamando o nome
        System.out.println("Income for " + monthAndYear + ": " +  String.format("%.2f", worker.income(year,month)));

    }

}