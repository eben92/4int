package com.company;

import java.util.Scanner;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        String uniqueID = UUID.randomUUID().toString();
        String newUser;
        AdminLogin admin = new AdminLogin();
        Customer customer = new Customer();



//        setting admin credentials
        admin.setUsername("admin");
        admin.setPassword("12345678");

//        System.out.println(admin.getUsername() );
//        System.out.println( admin.getPassword());

        Scanner isNewUser = new Scanner(System.in);
        System.out.println("Are you a new user? (YES or NO)");
        newUser = isNewUser.nextLine();

    if("YES".equals(newUser.toUpperCase())){
        System.out.println("CREATE A NEW ACCOUNT");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        customer.setUsername(input.nextLine());

        System.out.println("Enter your password: ");
        customer.setPassword(input.nextLine());

//        System.out.println(customer.getUsername());

        BankAccount account = new BankAccount(customer.getUsername(), uniqueID);
        account.showMenu();

} else {
        System.out.println("LOGIN TO YOUR ADMIN ACCOUNT");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");


        if(input.nextLine().toUpperCase().equals(admin.getUsername().toUpperCase())) {
            System.out.println("Enter your password: ");

            if(input.nextLine().equals(admin.getPassword())){
                BankAccount account = new BankAccount(admin.getUsername(), uniqueID);
                account.showMenu();


            } else{
                System.out.println("\n");
                System.out.println("------------------------");
                System.out.println("Incorrect password");
                System.out.println("------------------------");
            }

        } else{
            System.out.println("\n");
            System.out.println("------------------------");
            System.out.println("Invalid ADMIN credentials");
            System.out.println("------------------------");
        }


    };

    }
}
