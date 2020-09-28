package LoopInJava;

import java.util.Scanner;

public class designMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        while (true) {
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Input Width");
                    int width = input.nextInt();
                    System.out.println("Input Height");
                    int height = input.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Input Width");
                    int a = input.nextInt();
                    for (int i = 1; i <= a; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("Input Width");
                    int b = input.nextInt();
                    for (int i = 1; i <= b; i++) {
                        for (int j = 1; j + i <= b; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
