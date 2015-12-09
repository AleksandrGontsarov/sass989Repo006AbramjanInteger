import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 21.07.15.
 */
public class Integer019 {

//  С начала суток прошло N секунд (N — целое).
//  Найти количество полных минут, прошедших с начала суток.

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Введите кол-во секунд : ");
        int a = a1.nextInt();
        System.out.println();

        int b = a / 60;

        System.out.println("Кол-во полных минут = " + b);
    }
}