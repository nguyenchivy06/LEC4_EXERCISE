package lec4;

import java.util.Scanner;

public class Exercise4_SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen thu nhat: ");
        int num1 = scanner.nextInt();
        System.out.println("Nhap mot so nguyen thu hai: ");
        int num2 = scanner.nextInt();
        System.out.print("phep tinh (+, -, *, /): ");
        char pheptinh = scanner.next().charAt(0);
        switch (pheptinh) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
        }

    }
}
