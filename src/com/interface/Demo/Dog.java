import java.lang.*;

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog can eat");
    }

    public void moves() {
        System.out.println("Dog can run");
    }

    public static void main(String args[]) {
        Dog d = new Dog();
        d.eat();
        d.moves();
    }

}