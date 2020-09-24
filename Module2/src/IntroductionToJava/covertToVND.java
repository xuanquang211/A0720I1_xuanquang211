package IntroductionToJava;
import java.util.Scanner;
public class covertToVND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000.0;
        System.out.println("Input USD");
        double usd = scanner.nextDouble();
        double result = usd*vnd;
        System.out.println("VND = " + result + " VND");
    }
}
