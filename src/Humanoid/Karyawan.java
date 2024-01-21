package Humanoid;

public class Karyawan extends Human{
    private int age;

    public void sayAge(){
        System.out.println(getAge());
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}
