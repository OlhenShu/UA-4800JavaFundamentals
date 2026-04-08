package com.softserve.academy.hw1;

import java.util.Scanner;

public class UserInfo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Whats is your name?");

        String name = sc.nextLine();

        System.out.printf("Where do you live, %s?\n", name);

        String address = sc.nextLine();

        System.out.printf("Name: %s, Address: %s", name, address);

    }
}
