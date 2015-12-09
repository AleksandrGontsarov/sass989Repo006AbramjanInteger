import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 26.06.15.
 */
public class Integer003 {

//  Дан размер файла в байтах. Используя операцию деления нацело,
//  найти количество полных килобайтов, которые занимает данный
//  файл (1 килобайт = 1024 байта).

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Ввидите размер файла в байтах : ");
        int b = s.nextInt();
        System.out.println();

        int kb = b / 1024;

        System.out.println("Количество полных килобайтов в файле равно : " + kb);
    }
}
