import java.util.Scanner;
public class task1 {

    private String name;
    private int age;

    public task1(String name, int age){
        this.name=name;
        this.age=age;

    }
    public void speak(){
        System.out.println("I am " + this.name + "and I am " + this.age + "years old");

    }
}
