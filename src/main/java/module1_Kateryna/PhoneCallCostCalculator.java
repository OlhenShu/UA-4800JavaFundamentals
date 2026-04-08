package module1_Kateryna;
import java.util.Scanner;
public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input the cost per minute of call - c1: ");
        double c1 = scanner.nextDouble();
        System.out.println("Input the duration of call - t1: ");
        double t1 = scanner.nextDouble();
        System.out.println("Input the cost per minute of call - c2: ");
        double c2 = scanner.nextDouble();
        System.out.println("Input the duration of call - t2: ");
        double t2 = scanner.nextDouble();
        System.out.println("Input the cost per minute of call - c3: ");
        double c3 = scanner.nextDouble();
        System.out.println("Input the duration of call - t3: ");
        double t3 = scanner.nextDouble();
        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;
        double totalCost = cost1 + cost2 + cost3;
        System.out.println("The cost of the first call: " + cost1 +
                "\nThe cost of the second call: " + cost2 +
                "\nThe cost of the third call: " + cost3 +
                "\nThe total cost: " + totalCost);
        scanner.close();
    }
}


