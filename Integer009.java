import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 08.07.15.
 */
public class Integer9 {

//   Дано трехзначное число. Используя одну операцию
//   деления нацело, вывести первую цифру данного числа (сотни).

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Введите трехзначное число : ");
        int a = a1.nextInt();
        System.out.println();

        int b = a / 100;

        System.out.println("Выводим первую цифру данного числа (сотни) : " + b);
    }
}
