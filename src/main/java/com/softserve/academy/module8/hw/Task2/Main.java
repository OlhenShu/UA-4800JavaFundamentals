package com.softserve.academy.module8.hw.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[10];
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter range: ");
        int min = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());
        while (count < 10) {
            try {
                int num = NumberReader.readNumber(min, max, count);

                if(count > 0 && num <= nums[count - 1]){
                    System.out.println("Number must be greater than the previous one");
                    continue;
                }

                nums[count] = num;
                count++;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("All numbers entered");
        System.out.println("Numbers: " + Arrays.stream(nums).boxed().toList());
    }

}
