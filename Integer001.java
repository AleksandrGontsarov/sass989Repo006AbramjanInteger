import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 26.06.15.
 */
public class Integer001 {

// Дано расстояние L в сантиметрах. Используя операцию
// деления нацело, найти количество полных метров в нем
// (1 метр = 100 см).

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Ввидите расстояние в сантиметрах L : ");
        int l = s.nextInt();
        System.out.println();

        int m = l / 100;
        int km = m / 1000;

        System.out.println("Количество полных метров в расстоянии = " + m);
        System.out.println("Количество полных километров в расстоянии = " + km);
    }
}
