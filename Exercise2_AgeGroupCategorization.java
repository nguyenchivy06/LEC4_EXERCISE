package lec4;
 import java.util.Scanner;
public class Exercise2_AgeGroupCategorization {
        public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap do tuoi: ");
        int age = scanner.nextInt();
   if(age <= 12 ){
       System.out.println(" Day la tre em");
   }
   else if( age>= 13 && age <= 19 ){
       System.out.println(" Day la thanh thieu nien");
   }
    else if( age>= 25 && age <=  59){
       System.out.println(" Day la nguoi lon");
   }
    else if( age >= 60){
    System.out.println("Day la nguoi cao tuoi ");
   }
    }}
        

