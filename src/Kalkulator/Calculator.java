package Kalkulator;


public class Calculator extends Screen{

    public void hitung(){
        Screen screen = new Screen();
        do {
            angkaTrue = 1;
            while (angkaTrue == 1){
                System.out.println("=============Input Angka Pertama=============");
                try{
                    angkaPertama = Screen.inputanPertama();
                    System.out.println("Inputan Pertama Kamu = " + angkaPertama);
                    angkaTrue = 0;
                } catch (Exception e){
                    System.out.println("=============WARNING!!!! ITU BUKAN ANGKA=============");
                    angkaTrue = 1;
                }
            }
            angkaTrue = 1;
            while (angkaTrue == 1){
                System.out.println("=============Input Angka Kedua=============");
                try{
                    angkaKedua = Screen.inputanKedua();
                    System.out.println("Inputan Kedua Kamu = " + angkaKedua);
                    angkaTrue = 0;
                } catch (Exception e){
                    System.out.println("=============WARNING!!!! ITU BUKAN ANGKA=============");
                    angkaTrue = 1;
                }
            }
            do {
                System.out.println("=============Input Operatornya=============");
                System.out.println("============== +, -, *, /, % ==============");
                ops = Screen.inputanOperator();
                print = 2;
                switch (ops) {
                    case '+':
                        screen.setPenjumlahan(angkaPertama, angkaKedua);
                        result = screen.getPenjumlahan();
                        print = 0;
                        break;
                    case '-':
                        screen.setPengurangan(angkaPertama, angkaKedua);
                        result = screen.getPengurangan();
                        print = 0;
                        break;
                    case '*':
                        screen.setPerkalian(angkaPertama, angkaKedua);
                        result = screen.getPerkalian();
                        print = 0;
                        break;
                    case '/':
                        screen.setPembagian(angkaPertama, angkaKedua);
                        hasilPembagian = screen.getPembagian();
                        print = 1;
                        break;
                    case '%':
                        screen.setMod(angkaPertama, angkaKedua);
                        result = screen.getMOd();
                        print = 0;
                        break;
                    default:
                        System.out.println("Harus milih operator +, -, *, /, %");
                        break;
                }
                if (print == 1) {
                    System.out.println("Hasilnya adalah = " + String.format("%.2f", hasilPembagian));
                } else if (print == 0) {
                    System.out.println("Hasilnya adalah = " + result);
                } else {
                    ;
                }
            } while (print == 2);
            System.out.println("==========Apakah kamu ingin masih ingin menggunakan calculator ==========");
            System.out.println("=======================Tentukan Pilihanmu (Yes/No)=======================");
            do {
                screen.setDecision();
                decision = screen.getDecision();
                switch (decision) {
                    case "yes":
                    case "Yes":
                    case "YES":
                    case "yEs":
                    case "yeS":
                    case "YEs":
                    case "yES":
                        resultDecision = 1;
                        break;
                    case "No":
                    case "NO":
                    case "no":
                    case "nO":
                        resultDecision = 0;
                        break;
                    default:
                        System.out.println("==========kamu harus ketik antara (Yes/No)==========");
                        resultDecision = 2;
                        break;
                }
            }while(resultDecision == 2);
        }while(resultDecision == 1);
        System.out.println("============Calculator Berhasil Ditutup===========");
        System.out.println("=====================TERIMA KASIH=================");
    }
}
