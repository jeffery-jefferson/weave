package com.weave;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Weave!\n");

        String name;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Username: ");
            name = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();
        }
        System.out.println("Welcome, " + name + ".");
    }
}
