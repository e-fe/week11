package week11;

import java.util.Scanner;

public class klavyeden_girilen_harften_kac_tane_oldugunu_bulma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("KELİME GİRİN");
        String txt = input.nextLine();
        System.out.println("HARF GİRİNİZ");
        char harf = input.nextLine().charAt(0);
        int sayac = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == harf) {
                System.out.print((i + 1) + ",");
                sayac++;
            }

        }
            System.out.println("\n"+harf+" cümle içinde "+sayac+" kere geçmektedir");
    }

}
