import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 19.07.15.
 */
public class Integer014 {

//  Дано трехзначное число. В нем зачеркнули первую справа цифру
//  и приписали ее слева. Вывести полученное число.

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Введите трехзначное число : ");
        int a = a1.nextInt();
        System.out.println();

        int b = a / 100;        // первое число ( сотни)
        int c = (a % 100) / 10; // второе число ( десятки )
        int d = a % 10;         // третье число ( единицы )

        int e = d * 100 + b * 10 + c;

        System.out.println("Преобазованное число = " + e);
    }

}
