import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 26.06.15.
 */
public class Ineger004 {

//  Даны целые положительные числа A и B (A > B).
//  На отрезке длины A размещено максимально возможное
//  количество отрезков длины B (без наложений).
//  Используя операцию деления нацело, найти количество
//  отрезков B, размещенных на отрезке A.

    public static void main(String[] args) {

        System.out.println();
        Scanner s = new Scanner(System.in);
        System.out.print("Ввидите положительное число A : ");
        int a = s.nextInt();

        System.out.print("Ввидите положительное число B : ");
        int b = s.nextInt();
        System.out.println();

        if (a > b) {
            int res = a / b;
            System.out.println("Количество целых отрезков В, " +
                    "размещенных на отрезке А = " + res);
        } else {
            System.out.print("Ввидите А больше чем В : ");
            a = s.nextInt();
            int res = a / b;
            System.out.println();
            System.out.println("Количество целых отрезков В, " +
                    "размещенных на отрезке А = " + res);
        }
    }
}