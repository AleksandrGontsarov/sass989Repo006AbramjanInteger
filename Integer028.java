import java.util.Scanner;

/**
 * Created by Sass on 25.07.15.
 */
public class Integer028 {

//  Дни недели пронумерованы следующим образом: 1 — понедельник,
//  2 — вторник, ..., 6 — суббота, 7 — воскресенье.
//  Дано целое число K, лежащее в диапазоне 1–365, и целое
//  число N, лежащее в диапазоне 1–7. Определить номер дня
//  недели для K-го дня года, если известно, что в этом
//  году 1 января было днем недели с номером N.

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Введите день в диапазоне от 1-го до 365-ти : ");
        int a = a1.nextInt();
        System.out.println();
        System.out.println("Используя абривеатуру : ");
        System.out.println("mon - понедельник");
        System.out.println("tue - вторник");
        System.out.println("wed - среда");
        System.out.println("thu - четверг");
        System.out.println("fri - пятница");
        System.out.println("sat - суббота");
        System.out.println("sun - воскресенье");
        System.out.println("Введите латинскими буквами день недели которым был 1 января");
        String a2 = a1.next();

        int c = 0;
        if (a2 == "mon") {
            c = 0;
        } else if (a2 == "tue") {
            c = 1;
        } else if (a2 == "wed") {
            c = 2;
        } else if (a2 == "thu") {
            c = 3;
        } else if (a2 == "fri") {
            c = 4;
        } else if (a2 == "sat") {
            c = 5;
        } else if (a2 == "sun") {
            c = 6;
        }

        int b = (c + a) % 7; // день недели

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