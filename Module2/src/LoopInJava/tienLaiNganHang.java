package LoopInJava;
import java.util.Scanner;
public class tienLaiNganHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so tien can gui: ");
        int money = scanner.nextInt();
        System.out.println("Moi ban nhap lai suat: ");
        double rate = scanner.nextDouble();
        System.out.println("Moi ban nhap so thang can gui: ");
        int month = scanner.nextInt();
        double result = 0;
        for (int i = 0; i < month; i++) {
            result = result + money*(rate/1200);
        }
        System.out.println("Lai nhan duoc la: " + result);
    }
}
