package week11;
import java.util.Scanner;
public class harfyanınasayı {
     public static void main(String[] args){
     Scanner input = new Scanner(System.in);
         System.out.println("KELİME GİR");
         String txt = input.nextLine();
         char bos = ' ';
         for (int i = 0; i < txt.length(); i++) {
             if(txt.charAt(i)!= bos){
             System.out.print(txt.charAt(i));
             System.out.print(i+1+"  ");
                 
             }else{
                 System.out.print("boşluk var ");
             }
             /*System.out.print(txt.charAt(i));
             System.out.print(i+1);*/
             
         }

    }

}
