package LoopInJava;

import java.util.Scanner;

public class primeLess100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input prime number amount: ");
        for (int j = 2; j <= 100; j++) {
            if (checkPrime(j) == true) {
                System.out.println(j);
            }
        }
    }
        public static boolean checkPrime ( int temp){
            if (temp == 2) {
                return true;
            } else if (temp >= 3) {
                for (int i = 2; i < temp; i++) {
                    if (temp % i == 0) {
                        return false;
                    }
                }
            }
            return true;
        }
    }