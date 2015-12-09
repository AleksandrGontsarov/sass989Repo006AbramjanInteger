import java.util.Scanner;

/**
 * Created by Sass on 25.07.15.
 */
public class Integer029 {

//  Даны целые положительные числа A, B, C. На прямоугольнике
//  размера A × B размещено максимально возможное количество
//  квадратов со стороной C (без наложений). Найти количество
//  квадратов, размещенных на прямоугольнике, а также площадь
//  незанятой части прямоугольника.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите A : ");
        int a = s.nextInt();
        System.out.println("Введите B : ");
        int b = s.nextInt();
        System.out.println("Введите C : ");
        int c = s.nextInt();

        int c1 = a / c;
        int c2 = b / c;
        int c3 = c1 * c2;

        int s1 = a * b - c * c * c3;

        System.out.println("Количество квадратов C, размещенных на прямоугольнике AB : " + c3);
        System.out.println("Площадь незанятой части прямоугольника : " + s1);
    }
}