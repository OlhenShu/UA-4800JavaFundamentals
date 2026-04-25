package module4_Kateryna.homework_optional;

import java.util.Scanner;

public class HTTPErrors {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a number representing an HTTP error: ");
        int error = SCANNER.nextInt();
        switch (error) {
            case 400 -> System.out.println(HTTPError.BAD_REQUEST.getNameOfTheError());
            case 403 -> System.out.println(HTTPError.FORBIDDEN.getNameOfTheError());
            case 404 -> System.out.println(HTTPError.NOT_FOUND.getNameOfTheError());
            case 500 -> System.out.println(HTTPError.INTERNAL_SERVER_ERROR.getNameOfTheError());
            case 502 -> System.out.println(HTTPError.BAD_GATEWAY.getNameOfTheError());
            default -> throw new IllegalArgumentException("No such error found");
        }
    }
}
