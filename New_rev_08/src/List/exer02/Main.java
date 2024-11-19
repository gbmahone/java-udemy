package List.exer02;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employees> list = new ArrayList<>();


        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i=0; i< n;i++){
            sc.nextLine();
            System.out.println("Employee #" + (i+1) + ";");
            System.out.println("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();
            Employees emp = new Employees(id, name, salary);
            list.add(emp);
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();
        Employees emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
        if (emp == null){
            System.out.println("This id does not exist! ");

        }else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employees obj : list) {
            System.out.println(obj);
        }


    }

    public static boolean hasId(List<Employees> list, int id) {
        Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}