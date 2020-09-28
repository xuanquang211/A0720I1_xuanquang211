package IntroductionToJava;
import java.util.Scanner;
public class convertNumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number: ");
        int n = scanner.nextInt();
        if (n < 0 || n > 999) {
            System.out.println("out of ability");
        } else {
            System.out.println(convert(n));
        }
    }

    public static final String[] unit = {
        "Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"
    };
    public static final String[] ten = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    public static String convert(int n) {
        if (n < 20) {
            return unit[n];
        }
        if (n < 100) {
            return ten[n/10] + ((n%10==0) ? "" : unit[n%10]);
        }
        if (n < 1000) {
            return unit[n/100] + "hundred " + convert(n%100);
        }
        return unit[n/100];
    }
}
