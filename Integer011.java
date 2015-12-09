import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 08.07.15.
 */
public class Integer11 {

//  Дано трехзначное число. Найти сумму
//  и произведение его цифр.

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Введите трехзначное число : ");
        int a = a1.nextInt();
        System.out.println();

        int b = a / 100;        // первое число ( сотни)
        int c = (a % 100) / 10; // второе число ( десятки )
        int d = a % 10;         // третье число ( единицы )

        int e = b + c + d;      // сумма цифр
        int f = b * c * d;      // произведение цифр

        System.out.println("Сумма его цифр = " + b + "+" + c + "+" + d + " = " + e);
        System.out.println();
        System.out.println("Произведение его цифр = " + b + "x" + c + "x" + d + " = " + f);
    }
}