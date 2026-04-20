package com.softserve.academy.module4.optional;

import java.util.Scanner;

public class HTTPStatus {

    enum HTTPError {
        CONTINUE(100, "Continue"),
        OK(200, "OK"),
        CREATE(201, "Create"),
        BAD_REQUEST(400, "Bad Request"),
        NOT_FOUND(404, "Not Found"),
        INTERNAL_SERVER_ERROR(500, "Internal Server Error");

        private final int code;
        private final String message;

        HTTPError(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public int getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter HTTP status code:");
        int code = scanner.nextInt();

        switch (code) {
            case 100 -> System.out.println(HTTPError.CONTINUE.getMessage());
            case 200 -> System.out.println(HTTPError.OK.getMessage());
            case 201 -> System.out.println(HTTPError.CREATE.getMessage());
            case 400 -> System.out.println(HTTPError.BAD_REQUEST.getMessage());
            case 404 -> System.out.println(HTTPError.NOT_FOUND.getMessage());
            case 500 -> System.out.println(HTTPError.INTERNAL_SERVER_ERROR.getMessage());
            default -> System.out.println("Unknown status code");
        }

    }

}
