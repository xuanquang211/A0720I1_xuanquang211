package LoopInJava;
import java.util.Scanner;
public class checkPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Input Number To Check");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean result = checkPrime(n);
        if (result == true) {
            System.out.println(n + " is Prime Number");
        }
        else {
            System.out.println(n + " is not a Prime Number");
        }
        }

    public static boolean checkPrime(final int n) {
        if (n < 1) {return false;}
        if (n == 2) {
            return true;
        }
        if (n > 2) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
