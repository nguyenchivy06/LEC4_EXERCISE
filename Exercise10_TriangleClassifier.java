package lec4;
import java.util.Scanner;
public class Exercise10_TriangleClassifier {
    public static void main(String[] agrs){
        //tổng 2 cạnh + lại phải lớn hơn cạnh kia
        //tam giác đều (tất cả ba cạnh đều bằng nhau), 
        //tam giác cân (hai cạnh bằng nhau), 
        //hay tam giác vuông (không có cạnh nào bằng nhau)
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh a: ");
        float a = scanner.nextFloat();
        System.out.println("nhap canh b: ");
        float b = scanner.nextFloat();
        System.out.println("nhap canh c: ");
        float c = scanner.nextFloat();
        if( a + b < c || b + c < a || c + a < b){
            System.out.println("Nhung canh nay khong the tao ra tam giac");
        }
        else if( a == b && b     == c){
            System.out.println("Day la tam giac deu");
        }
        else if( a == b || b == c || c == a){
            System.out.println("Day la tam giac can");
        }
        else if (a * a + b * b == c * c ||a * a + c * c == b * b || b * b + c * c == a * a){
            System.out.println("Day la tam giac vuong");
        }
    }}
