package module1_Kateryna;
import java.util.Scanner;
public class FlowerBedCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input the radius of the flower bed:");
        int radius = scanner.nextInt();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter is " + perimeter);
        System.out.println("Area is " + area);
        scanner.close();
    }
}

