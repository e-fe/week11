package week11;
import java.util.Scanner;
public class buyugukucukveters {
     public static void main(String[] args){
     Scanner input = new Scanner(System.in);
         System.out.println("KELİME GİR");
         String txt = input.nextLine();
         for (int i =0; i < txt.length()/2; i++) {
             System.out.print(Character.toLowerCase(txt.charAt(i)));
             System.out.print(Character.toLowerCase(txt.charAt(txt.length()-1-i)));
             
         }
         if(txt.length() % 2 !=0){
             System.out.println(Character.toLowerCase(txt.charAt(txt.length()/2)));
         }

    }

}
