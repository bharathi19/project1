import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String args[])
    {
        Map<Integer,String> hm=new HashMap<>();
        hm.put(1,"bharathi");
        hm.put(2,"Kannama");
        hm.put(3,"thiruvalluvar");
        hm.put(4,"vasugi");
        System.out.println("output using foreach loop");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
