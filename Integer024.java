import java.util.Scanner;

/**
 * Created by Sass on 24.07.15.
 */
public class Integer024 {

// Дни недели пронумерованы следующим образом:
// 0 — воскресенье, 1 — понедельник, 2 — вторник,
// ..., 6 — суббота. Дано целое число K, лежащее
// в диапазоне 1–365. Определить номер дня недели для
// K-го дня года, если известно, что в этом году
// 1 января было понедельником.

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Введите день в диапазоне от 1-го до 365-ти : ");
        int a = a1.nextInt();
        System.out.println();

        int b = a % 7; // день недели
        String mon = "понедельник";
        String tue = "вторник";
        String wed = "среда";
        String thu = "четверг";
        String fri = "пятница";
        String sat = "суббота";
        String sun = "воскресенье";

        String weekday = new String();

        if (b == 0) {
            weekday = sun;
        } else if (b == 1) {
            weekday = mon;
        } else if (b == 2) {
            weekday = tue;
        } else if (b == 3) {
            weekday = wed;
        } else if (b == 4) {
            weekday = thu;
        } else if (b == 5) {
            weekday = fri;
        } else if (b == 6) {
            weekday = sat;
        }

        System.out.println("Введеный вами день : " + weekday);
    }
}