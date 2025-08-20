package lec4;
import java.util.Scanner;
public class Exercise11_QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);

        System.out.print("Nhap a: ");
        float a = nhap.nextFloat();
        System.out.print("Nhap b: ");
        float b = nhap.nextFloat();
        System.out.print("Nhap c: ");
        float c = nhap.nextFloat();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) System.out.println("Phuong trinh co vo so nghiem.");
                else System.out.println("Phuong trinh vo nghiem.");
            } else {
                System.out.println("Nghiem la x = " + (-c / b));
            }
        } else {
            float delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem.");
            } else if (delta == 0) {
                System.out.println("Phuong trinh co nghiem kep x = " + (-b / (2 * a)));
            } else {
                float x1 = (float)((-b + Math.sqrt(delta)) / (2 * a));
                float x2 = (float)((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}



