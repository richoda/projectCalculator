package Kalkulator;

import java.util.Scanner;

public class Screen{
    public long angkaPertama;
    public long angkaKedua;
    public long result;
    public char ops;
    public long hasil;
    public long print;
    public double hasilPembagian;
    public long angkaTrue;
    public String decision;
    public long resultDecision;

    public static long inputanPertama(){
        Scanner angkaPertama = new Scanner(System.in);
        long pertama = angkaPertama.nextLong();
        return pertama;
    }
    public static long inputanKedua(){
        Scanner angkaKedua = new Scanner(System.in);
        long kedua = angkaKedua.nextLong();
        return kedua;
    }
    public static char inputanOperator(){
        Scanner operator = new Scanner(System.in);
        char ops = operator.next().charAt(0);
        return ops;
    }
    public void setPenjumlahan(long angkaPertama, long angkaKedua){
        hasil = angkaPertama + angkaKedua;
        this.hasil = hasil;
    }
    public long getPenjumlahan(){
        return this.hasil;
    }
    public void setPengurangan(long angkaPertama, long angkaKedua){
        hasil = angkaPertama - angkaKedua;
        this.hasil = hasil;
    }
    public long getPengurangan(){return this.hasil;}
    public void setPerkalian(long angkaPertama, long angkaKedua){
        hasil = angkaPertama * angkaKedua;
        this.hasil = hasil;
    }
    public long getPerkalian(){
        return this.hasil;
    }
    public void setPembagian(long angkaPertama, long angkaKedua){
        double hasilPembagian = (double) angkaPertama / angkaKedua;
        this.hasilPembagian = hasilPembagian;
    }
    public double getPembagian(){
        return this.hasilPembagian;
    }
    public void setMod(long angkaPertama, long angkaKedua){
        hasil = angkaPertama % angkaKedua;
        this.hasil = hasil;
    }
    public long getMOd(){
        return this.hasil;
    }
    public void setDecision(){
        Scanner decision = new Scanner(System.in);
        this.decision = decision.next().toString();
    }
    public String getDecision(){return this.decision;}


}
