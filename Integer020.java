import java.util.Scanner;

/**
 * Created by Sass on 24.07.15.
 */
public class Integer020 {

// С начала суток прошло N секунд (N — целое). Найти
// количество полных часов, прошедших с начала суток.

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Введите кол-во секунд : ");
        int a = a1.nextInt();
        System.out.println();

        int b = (a / 60) / 60;

        System.out.println("Кол-во полных часов = " + b);
    }
}