package exerSecao9;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Inform the account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name of the account name: ");
        String accountName = sc.nextLine();
        System.out.print("Do you want to make a deposit(y/n)? ");
        double deposit = 0.0;
        char response = sc.next().charAt(0);
            if (response == 'y'){
                System.out.print("Initial deposit amount: ");
                deposit = sc.nextDouble();
                conta = new Conta(accountNumber, accountName, deposit);
            } else {
                conta = new Conta(accountNumber,accountName);
            }



        System.out.println();
        System.out.println("Account data: \n" + conta);


        System.out.println();
        System.out.print("Enter a deposit value: ");
        deposit = sc.nextDouble();
        conta.deposit(deposit);

        System.out.println();
        System.out.print("Update account data: " + conta);


        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double debit = sc.nextDouble();
        conta.withdraw(debit);

        System.out.println();
        System.out.print("Update account data: " + conta);

} }