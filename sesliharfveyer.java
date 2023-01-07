package week11;
import java.util.Scanner;
public class sesliharfveyer {
     public static void main(String[] args){
     Scanner input = new Scanner(System.in);
         System.out.println("CÜMLE GİR !! ");
         String txt = input.nextLine();
         char dizi [] = {'a','e','i','u','o'};
         int yer [] = new int[255];
         int sayac = 0;
         for (int i = 0; i < txt.length(); i++) {
             for (int j = 0; j < dizi.length; j++) {
                 if(txt.charAt(i) == dizi[j]){
                     System.out.println((i+1)+". sırada "+ dizi[j] + " harfi bulunur");
                     yer[sayac] = i ;
                     sayac++;
                 }
                 
             }
         }
         System.out.println("cümlede"+sayac+" tane sesli harf var");
         for (int i = 0; i < sayac; i++) {
             System.out.println(yer[i]);
             
         }
    }

}
