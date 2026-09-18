package com.mycompany.main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        Login login = new Login(firstName, lastName);

        System.out.print("Enter Username (must contain _ and <=5 chars): ");
        String username = scanner.nextLine();

        System.out.print("Enter Password (8 chars, capital, number, special): ");
        String password = scanner.nextLine();

        System.out.print("Enter SA Cell Number (e.g +27831234567): ");
        String cell = scanner.nextLine();

        String registrationResult = login.registerUser(username, password, cell);
        System.out.println(registrationResult);

        // Only allow login if registration succeeded
        if (registrationResult.contains("successfully")) {
            System.out.println("\n--- LOGIN ---");
            System.out.print("Enter Username: ");
            String loginUser = scanner.nextLine();
            System.out.print("Enter Password: ");
            String loginPass = scanner.nextLine();

            System.out.println(login.returnLoginStatus(loginUser, loginPass));
        }
    }
}