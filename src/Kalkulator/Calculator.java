package Kalkulator;
import java.util.Scanner;

public class Calculator {
    public int angkaPertama;
    public int angkaKedua;
    public int result;

    public void hitung(){
        Scanner operator = new Scanner(System.in);
        char ops = operator.next().charAt(0);
        switch(ops){
            case '+':
                result = angkaPertama + angkaKedua;
                System.out.println(result);
                break;
            case '-':
                result = angkaPertama - angkaKedua;
                System.out.println(result);
                break;
            default:
                System.out.println("Harus milih operator +, -, *, /");
                break;
        }
    }
}
