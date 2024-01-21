package Humanoid;

public class Directur extends Human implements Kantor{
    private String myName;
    private int myAge;
    public void alamatKantor(){
        System.out.println("alamat di JP");
    }
    public Directur(){
    }

    public Directur(String name){
        String myname = name;
        System.out.println(myname);
    }

    public Directur(String name, int age){
        this.myName = name;
        this.myAge = age;
        System.out.println("name saya "+ name + ", usia saya " + age);
    }
    public void printJabatan() {
        System.out.println();
    }

    public void eat(){
        super.setName("richo");
        super.sayName();
        System.out.println("saya makan aw aw aw");
    }



}
