package com.example.menuapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuService service = new MenuService();
        int choice;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Add User");
            System.out.println("2. List Users");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    service.createUser(name, email);
                }
                case 2 -> service.listUsers();
                case 0 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}
