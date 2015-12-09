import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 19.07.15.
 */
public class Integer015 {

//    Дано трехзначное число. Вывести число, полученное при
//    перестановке цифр сотен и десятков исходного числа
//    (например, 123 перейдет в 213).

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Введите трехзначное число : ");
        int a = a1.nextInt();
        System.out.println();

        int b = a / 100;        // первое число ( сотни)
        int c = (a % 100) / 10; // второе число ( десятки )
        int d = a % 10;         // третье число ( единицы )

        int e = c * 100 + b * 10 + d;

        System.out.println("Преобазованное число = " + e);
    }
}