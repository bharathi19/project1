import java.util.*;

public class overloadDemo {
    void test() {
        System.out.println("No parameter");
    }

    void test(int a) {
        System.out.println("a: " + a);

    }

    void test(int a, int b) {
        System.out.println("a and b " + a + " " + b);
    }
}

class overload {
    public static void main(String args[]) {
        overloadDemo ol = new overloadDemo();
        ol.test();
        ol.test(5);
        ol.test(4, 6);
    }
}

