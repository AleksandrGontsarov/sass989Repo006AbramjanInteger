import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 08.07.15.
 */
public class Integer8 {

//    Дано двузначное число. Вывести число, полученное
//    при перестановке цифр исходного числа.

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Введите двузначное число : ");
        int a = a1.nextInt();
        System.out.println();

        int b = a / 10;
        int c = a % 10; // % взятие остатка от деления
        int d = c * 10 + b;// переворачиваем число

        System.out.println("Перевернем число : " + d);
    }
}