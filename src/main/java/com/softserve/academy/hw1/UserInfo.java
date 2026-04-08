package com.softserve.academy.hw1;

import java.util.Scanner;

class UserInfo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = sc.nextLine();
        System.out.println("Where do you live?:  ");
        String address = sc.nextLine();
        System.out.println("Name: " + "[" + name + "]" + "\nAddress: " + "[" + address + "]");

        sc.close();
    }
}
