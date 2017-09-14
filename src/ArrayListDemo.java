import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Bharathi");
        name.add("Bharath");
        name.add("Thilagavathi");
        name.add("Venkatesan");
        System.out.println("The Element at position 2 " + name.get(2));
        //foreach loop
        System.out.println("foreach loop output");
        for (String s : name) {
            System.out.println(s);
        }
        //iteration
        Iterator itr = name.iterator();
        System.out.println("iterator output");
        while (itr.hasNext()) {

            System.out.println(itr.next());
        }

    }
}
