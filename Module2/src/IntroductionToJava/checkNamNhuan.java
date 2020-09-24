package IntroductionToJava;
import java.util.Scanner;
public class checkNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Year: ");
        int month = scanner.nextInt();
        if (month % 100 == 0) {
            if (month % 400 == 0) {
                System.out.println(month + " la nam nhuan");
            } else {
                System.out.println(month + " khong phai nam nhuan");
            }
        } else {
            if (month % 4 == 0) {
                System.out.println(month + " la nam nhuan");
            } else {
                System.out.println(month + " khong phai nam nhuan");
            }
        }
    }
}