package lec4;
import java.util.Scanner;
public class Exercise8_QuadrantDetermination {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap toa do diem x: ");
        float x = scanner.nextFloat();
        System.out.println("Nhap toa do diem y: ");
        float y = scanner.nextFloat();
        if ( x > 0 && y > 0){
            System.out.println("Diem nam  trong toa do 1");
        }
        else if ( x < 0 && y > 0 ){
            System.out.println("Diem nam trong toa do 2");
        }
        else if ( x < 0 && y < 0 ){
            System.out.println("Diem nam trong toa do 3");
        }
        else if ( x > 0 && y < 0 ){
            System.out.println("Diem nam trong toa do 4");
        }
    }
    
}
