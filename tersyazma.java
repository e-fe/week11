package week11;
import java.util.Scanner;
public class tersyazma {
     public static void main(String[] args){
     Scanner input = new Scanner(System.in);
         System.out.println("cümle  GİR !!");
         String txt = input.nextLine();
         for (int i = txt.length()-1; i >= 0; i--) {
             
             System.out.print(txt.charAt(i));
             
         }
         }
         
         
    }


