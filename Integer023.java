import java.util.Scanner;

/**
 * Created by Sass on 24.07.15.
 */
public class Integer023 {

//   С начала суток прошло N секунд (N — целое). Найти
//   количество полных минут, прошедших с начала последнего часа.

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Введите кол-во секунд : ");
        int a = a1.nextInt();
        System.out.println();

        int b = (a % 3600); // остаток секунд после часа
        int c = b / 60;

        System.out.println("Кол-во минут, прошедших с начала последнего часа = " + c);
    }
}