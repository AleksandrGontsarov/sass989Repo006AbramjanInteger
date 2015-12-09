import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 26.06.15.
 */
public class Integer002 {

//  Дана масса M в килограммах. Используя операцию деления
//  нацело, найти количество полных тонн в ней
//  (1 тонна = 1000 кг).

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Ввидите массу в килограммах М : ");
        int m = s.nextInt();
        System.out.println();

        int t = m / 1000;

        System.out.println("Количество полных тонн в массе = " + t);
    }
}
