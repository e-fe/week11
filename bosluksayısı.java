package week11;
import java.util.Scanner;
public class bosluksayısı {
     public static void main(String[] args){
     Scanner input = new Scanner(System.in);
         System.out.println("CÜMLE GİR");
         String txt = input.nextLine();
         char of [] = {' ' , ',' , '!' , '.' , '?'};
         int sayac = 0 ;
         for (int i = 0; i < txt.length(); i++) {
             char h = txt.charAt(i);
             for (int j = 0; j < of.length; j++) {
                 if(h== of[j]){
                     sayac++;
                 }
                 
             }
             
         }
         System.out.println("cümlede toplam  "+sayac+" kadar kelime vardır");
    }

}
