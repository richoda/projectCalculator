package Kalkulator;

import java.util.Scanner;

public class Screen extends Calculator {
    public static int inputanPertama(){
        Scanner angkaPertama = new Scanner(System.in);
        int pertama = angkaPertama.nextInt();
        return pertama;
    }

    public static int inputanKedua(){
        Scanner angkaKedua = new Scanner(System.in);
        int kedua = angkaKedua.nextInt();
        return kedua;
    }

    public static char inputanOperator(){
        Scanner operator = new Scanner(System.in);
        char ops = operator.next().charAt(0);
        return ops;
    }

}
