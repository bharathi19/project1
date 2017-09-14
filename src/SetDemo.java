import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String args[]) {
        //it does not allow duplicacy
        //tree set arrange the element in ascending order
        HashSet<String> name = new HashSet<>();
        name.add("Bharathi");
        name.add("Karthick");
        name.add("Vijay");
        name.add("Suriya");
        name.add("Bharathi");
        System.out.println("Foreach loop output");
        for (String s : name) {
            System.out.println(s);
        }
        System.out.println("Iterater output");
        Iterator itr = name.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
