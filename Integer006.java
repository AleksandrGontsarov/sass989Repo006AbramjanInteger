import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 08.07.15.
 */
public class Integer6 {

//  Дано двузначное число. Вывести вначале его левую
//  цифру (десятки), а затем — его правую цифру (единицы).
//  Для нахождения десятков использовать операцию
//  деления нацело, для нахождения единиц — операцию
//  взятия остатка от деления.

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Введите двузначное число : ");
        int a = a1.nextInt();
        System.out.println();

        int b = a / 10;
        int c = a % 10; // % взятие остатка от деления

        System.out.println("Выводим вначале его левую цифру (десятки) : " + b);
        System.out.println();
        System.out.println("а затем — его правую цифру (единицы) : " + c);
    }
}