package com.softserve.academy.task1;

import java.util.Scanner;

public class UserInfo {
    static void main() {
        String name;
        String address;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        name = scanner.nextLine();
        System.out.println("Where do you live, " + name);
        address = scanner.nextLine();
        System.out.print("Name: " + name + ", Address: " + address);
        scanner.close();
    }
}
