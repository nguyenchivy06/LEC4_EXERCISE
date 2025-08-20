package lec4;

import java.util.Scanner;

public class Exercise5_DayoftheWeek {


public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);{
    System.out.println("Nhap mot so tu 2 den 8: ");
    int so = scanner.nextInt();
    if ( so < 2 || so > 8 ){
    System.out.println("Loi!, Hay nhap lai");}
    switch (so){
        case 2:
            System.out.println("Thu Hai");
            break;
            case 3:
            System.out.println("Thu Ba");
            break;
            case 4:
            System.out.println("Thu Tu");
            break;
            case 5:
            System.out.println("Thu Nam");
            break;
            case 6:
            System.out.println("Thu Sau");
            break;
            case 7:
            System.out.println("Thu Bay");
            break;
            case 8:
            System.out.println("Thu Chu Nhat");
            break;
    }
            
    }
        
}
    
}
