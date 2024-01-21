package Humanoid;

public class Human {
    private String name;

    public void sayName(){
        System.out.println(getName());
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void eat(){
        System.out.println("saya makan nyam nyam nyam");
    }
}
