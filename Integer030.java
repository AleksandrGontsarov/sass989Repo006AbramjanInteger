import java.util.Scanner;

/**
 * Created by Sass on 25.07.15.
 */
public class Integer030 {

//  Дан номер некоторого года (целое положительное число).
//  Определить соответствующий ему номер столетия,
//  учитывая, что, к примеру, началом 20 столетия был 1901 год.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ввидите год : ");
        int year = s.nextInt();

        int century = ((year - 1) / 100) + 1;

        System.out.println("Введенный вами год соответствует " + century + "-му столетию.");
    }
}