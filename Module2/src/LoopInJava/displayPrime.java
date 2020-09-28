package LoopInJava;

import java.util.Scanner;

public class displayPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input prime number amount: ");
        int amount = input.nextInt();
        int number = 2;
        int j = 1;
        while (j <= amount) {
            if (checkPrime(number) == true) {
                System.out.println(number);
                j++;
            }
            number++;
        }
    }
public static boolean checkPrime(int temp) {
        if (temp == 2) {
            return true;
        }
        else if (temp >= 3) {
            for (int i = 2; i < temp; i ++) {
                if (temp%i==0) {
                    return false;
                }
            }
    }
        return true;
}
}