import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 21.07.15.
 */
public class Integer018 {

//   Дано целое число, большее 999. Используя одну операцию
//   деления нацело и одну операцию взятия остатка от деления,
//   найти цифру, соответствующую разряду тысяч в записи этого числа.

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Введите число ,больше 999 : ");
        int a = a1.nextInt();
        System.out.println();

        int b = a / 1000;
        int c = (b % 10);

        System.out.println("Цифра, соответствующая разряду тысяч = " + c);
    }
}