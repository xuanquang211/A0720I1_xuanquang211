package LoopInJava;
import java.util.Scanner;
public class uongChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so a: ");
        int a = scanner.nextInt();
        System.out.println("Moi ban nhap so b: ");
        int b = scanner.nextInt();
        while (a != b ) {
            if (a < b) {
                b = b - a;
            }
            else {
                a = a - b;
            }
        }
        System.out.println("Uoc chung lon nhat cua a va b la: " + a);
    }


}
