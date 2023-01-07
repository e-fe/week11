package week11;
import java.util.Scanner;
public class Week11 {
     public static void main(String[] args){
     Scanner input = new Scanner(System.in);
         System.out.println("lütfen adınızı giriniz");
         String txt = input.nextLine();
         System.out.println("ADINIZ : "+txt);
         for (int i = 0; i < txt.length(); i++) {
             System.out.println((i+1)+". harf:"+" "+txt.charAt(i));
             
         }
    }

}
