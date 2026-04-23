package com.softserve.academy.module4;

import java.util.Scanner;

public class DialogSwithEx {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Do you want to continue? (yes/maybe/no)");
        String userInput = scanner.nextLine().toLowerCase();

        String response = switch (userInput) {
            case "yes", "maybe" -> "Great! Let's continue.";
            case "no" -> "Okay, maybe next time.";
            default -> "Invalid input. Please enter 'yes', 'maybe', or 'no'.";
        };
        System.out.println(response);

        String role = scanner.nextLine().toUpperCase();

        String permissions = switch (role) {
            case "ADMIN" -> {
                System.out.println("You have full access.");
                yield "Full Access";
            }
            case "USER" -> {
                System.out.println("You have limited access.");
                yield "Limited Access";
            }
            case "GUEST" -> {
                System.out.println("You have guest access.");
                yield "Guest Access";

            }
            default -> {
                System.out.println("Invalid role.");
                yield "No Access";
            }
        };
        System.out.println("Your permissions: " + permissions);

    }
}

class Role {
    private String name;

    public static Role admin = new Role("Admin");
    public static Role user = new Role("User");
    public static Role guest = new Role("Guest");

    private Role(String name) {
        this.name = name;
    }
}

enum RoleEnum {
    ADMIN, USER, GUEST;

    //methods for providing permissions can be added here
    public String getPermissions() {
        return switch (this) {
            case ADMIN -> "Full Access";
            case USER -> "Limited Access";
            case GUEST -> "Guest Access";
            default -> "No Access";
        };

    }
}