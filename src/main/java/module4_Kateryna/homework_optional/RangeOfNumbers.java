package module4_Kateryna.homework_optional;

import java.util.Scanner;

public class RangeOfNumbers {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        double number1 = SCANNER.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = SCANNER.nextDouble();
        System.out.print("Enter third number: ");
        double number3 = SCANNER.nextDouble();

        String result = (((number1 >= -5) && (number1 <= 5)) &&
                ((number2 >= -5) && (number2 <= 5)) &&
                ((number3 >= -5) && (number3 <= 5))) ? "All numbers belong to the range [-5,5]" :
                "Not all numbers belong to the range [-5,5]";

        System.out.print(result);
    }
}

