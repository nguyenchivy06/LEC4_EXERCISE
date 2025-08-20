package lec4;
import java.util.Scanner;
public class Exercise9_AbsoluteValuewithTernaryOperator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 1 so: ");
        int num = scanner.nextInt();
        if (num >= 0){
            System.out.print("Gia tri tuyet doi la: "+(num));}
            else 
            {System.out.print("Gia tri tuyet doi la: "+(-num));
        }
                
    }
    
}
