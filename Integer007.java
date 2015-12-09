import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 08.07.15.
 */
public class Integer7 {

// Дано двузначное число. Найти сумму и произведение его цифр.

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Введите двузначное число : ");
        int a = a1.nextInt();
        System.out.println();

        int b = a / 10;
        int c = a % 10; // % взятие остатка от деления
        int d = b + c;
        int e = b * c;

        System.out.println("Сумма его цифр = " + b + "+" + c + " = " + d);
        System.out.println();
        System.out.println("Произведение его цифр = " + b + "x" + c + " = " + e);
    }
}