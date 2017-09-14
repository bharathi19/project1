
public class overrideDemo {
    void move() {
        System.out.println("Animals can move");
    }
}

class dog extends overrideDemo{
    void move() {
        System.out.println("Dogs can move");
    }
}

class test
{
    public static void main(String args[])
    {
    dog d=new dog();
    d.move();
}}