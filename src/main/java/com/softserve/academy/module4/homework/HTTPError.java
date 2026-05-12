package com.softserve.academy.module4.homework;

import java.util.Scanner;

public class HTTPError {
    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter code of problem: ");
        int code = SCANNER.nextInt();
        switch (code) {
            case 400 -> System.out.println(HTTPErrors.BAD_REQUEST.getNameOfError()
                    + HTTPErrors.BAD_REQUEST.getCodeError());
            case 401 -> System.out.println(HTTPErrors.UNAUTHORIZED.getNameOfError()
                    + HTTPErrors.UNAUTHORIZED.getCodeError());
            case 403 -> System.out.println(HTTPErrors.FORBIDDEN.getNameOfError()
                    + HTTPErrors.FORBIDDEN.getCodeError());
            case 404 -> System.out.println(HTTPErrors.NOT_FOUND.getNameOfError()
                    + HTTPErrors.NOT_FOUND.getCodeError());
            case 405 -> System.out.println(HTTPErrors.METHOD_NOT_ALLOWED.getNameOfError()
                    + HTTPErrors.METHOD_NOT_ALLOWED.getCodeError());
            default -> throw new IllegalArgumentException("Invalid code " + code + " within range 400-503");
        }
    }
}