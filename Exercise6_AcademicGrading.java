package lec4;
import java.util.Scanner;
public class Exercise6_AcademicGrading {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap diem: ");
        float diem = scanner.nextFloat();
    if( diem >= 9 && diem <= 10   ){
        System.out.println("Xuat sac");
    } 
    else if ( diem >= 8 && diem <= 8.9){
        System.out.println("Tot");
    }
    else if ( diem >= 6.5 && diem <= 7.9){
        System.out.println("Kha");
    }
    else if ( diem >= 5 && diem <= 6.4){
        System.out.println("Trung Binh");
    }
    else if ( diem < 5){
        System.out.println("Truot");
    }
    }
}
