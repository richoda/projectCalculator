package Kalkulator;
import java.util.Scanner;

public class Calculator {
    public int angkaPertama;
    public int angkaKedua;
    public int result;
    public char ops;

    public void hitung(){
        System.out.println("=============Input Angka Pertama=============");
        angkaPertama = Screen.inputanPertama();
        System.out.println("=============Input Angka Kedua=============");
        angkaKedua = Screen.inputanKedua();
        System.out.println("=============Input Operatornya=============");
        ops = Screen.inputanOperator();
        switch(ops){
            case '+':
                result = angkaPertama + angkaKedua;
                System.out.println(result);
                break;
            case '-':
                result = angkaPertama - angkaKedua;
                System.out.println(result);
                break;
            case '*':
                result = angkaPertama * angkaKedua;
                System.out.println(result);
                break;
            case '/':
                result = angkaPertama / angkaKedua;
                System.out.println(result);
                break;
            default:
                System.out.println("Harus milih operator +, -, *, /");
                break;
        }
    }
}
