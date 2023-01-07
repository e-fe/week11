package week11;

import java.util.Scanner;

public class tersyazmakb {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CÜMLE GİR !!");
        String txt = input.nextLine();
        int sayac = 0;
        for (int i = txt.length()-1; i >= 0; i--) {
            if (sayac % 2 == 0){
            System.out.print(Character.toLowerCase(txt.charAt(i)));

            }else {
                System.out.print(Character.toUpperCase(txt.charAt(i)));
                    
            }
                    sayac++;

                

        }
    }
}


