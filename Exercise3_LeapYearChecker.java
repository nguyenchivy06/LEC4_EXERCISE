package lec4;

import java.util.Scanner;

public class Exercise3_LeapYearChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap nam: ");
        int nam = scanner.nextInt();
        if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
            System.out.println("Day la nam nhuan");
        } else {
            System.out.println("Day la nam khong nhuan");
        }

    }
}
