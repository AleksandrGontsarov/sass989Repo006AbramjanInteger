import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 19.07.15.
 */
public class Integer013 {
    public static void main(String[] args) {

//  Дано трехзначное число. В нем зачеркнули первую
//  слева цифру и приписали ее справа. Вывести полученное число.

        Scanner a1 = new Scanner(System.in);
        System.out.print("Введите трехзначное число : ");
        int a = a1.nextInt();
        System.out.println();

        int b = a / 100;        // первое число ( сотни)
        int c = (a % 100) / 10; // второе число ( десятки )
        int d = a % 10;         // третье число ( единицы )

        int e = c * 100 + d * 10 + b;

        System.out.println("Преобазованное число = " + e);
    }
}