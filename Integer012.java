import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 09.07.15.
 */
public class Integer012 {

//   Дано трехзначное число. Вывести число,
//   полученное при прочтении исходного числа справа налево.

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Введите трехзначное число : ");
        int a = a1.nextInt();
        System.out.println();

        int b = a / 100;        // первое число ( сотни)
        int c = (a % 100) / 10; // второе число ( десятки )
        int d = a % 10;         // третье число ( единицы )

        int e = d*100+c*10+b;

        System.out.println("Перевернутое число = "+e);
    }
}