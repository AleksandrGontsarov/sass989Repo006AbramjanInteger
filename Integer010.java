import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 08.07.15.
 */
public class Integer10 {

//    Дано трехзначное число. Вывести вначале его
//    последнюю цифру (единицы), а затем — его
//    среднюю цифру (десятки).

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Введите трехзначное число : ");
        int a = a1.nextInt();
        System.out.println();

        int b = a % 100;
        int c = a % 10;
        int d = b / 10;

        System.out.println("Ввыводим последнюю цифру данного числа (единицы) : " + c);
        System.out.println();
        System.out.println("Выводим среднюю цифру данного числа (десятки) : " + d);
    }
}