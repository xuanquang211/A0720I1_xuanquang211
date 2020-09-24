package IntroductionToJava;
import java.util.Scanner;
public class showHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = scanner.next();
        System.out.println("Hello " + name);
    }
}
