package package_2;

public class Dack extends Bird {


    public Dack(String name) {
        super("Sam");

    }

    public void swim(){
        System.out.println("I am swiming");
    }
    public void print(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(hz);
    }

    @Override
    public String toString() {
        return "Dack{}";
    }

    @Override
    public void walk() {
       System.out.println("Ходить как утка");


    }
}
