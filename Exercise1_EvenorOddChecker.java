package lec4;

 import java.util.Scanner;

public class Exercise1_EvenorOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " day la mot so chan");
        } else {
            System.out.println(number + " day la mot so le");
        }

        scanner.close();
    }
}

