package lec4;
import java.util.Scanner;
public class Exercise7_FindtheMaximumofThreeNumbers {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        int num1 = scanner.nextInt();
        System.out.println("Nhap so thu hai: ");
        int num2 = scanner.nextInt();
        System.out.println("Nhap so thu ba: ");
        int num3 = scanner.nextInt();
        if ( num1 >= num2 && num1 >= 3){
            System.out.println("So lon nhat la:" + (num1));
        }
        else if ( num2 >= num1 && num2 >= num3 ){
            System.out.println("So lon nhat la:" + (num2));
        }
        else if ( num3 >= num1 && num3 >= num2 ){
            System.out.println("So lon nhat la:" + (num3));
        }
            
        
        
    }
    
}
