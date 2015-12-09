import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 01.07.15.
 */
public class Integer005 {

//  Даны целые положительные числа A и B (A > B).
//  На отрезке длины A размещено максимально возможное
//  количество отрезков длины B (без наложений).
//  Используя операцию взятия остатка от деления нацело,
//  найти длину незанятой части отрезка A.

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
            int res2 = a - res * b;
            System.out.println("Количество целых отрезков В, " +
                    "размещенных на отрезке А = " + res);
            System.out.println("Длина незанятой части отрезка А = "+res2);
        } else {
            System.out.print("Ввидите А больше чем В : ");
            a = s.nextInt();
            int res = a / b;
            int res2 = a - (res * b);
            System.out.println();
            System.out.println("Количество целых отрезков В, " +
                    "размещенных на отрезке А = " + res);
            System.out.println("Длина незанятой части отрезка А = "+res2);
        }
    }
}