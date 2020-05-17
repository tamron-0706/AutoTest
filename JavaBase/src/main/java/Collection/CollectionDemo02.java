package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("java");

//        c.clear();
        System.out.println(c.remove("world"));

        System.out.println(c.contains("hello"));

        System.out.println(c.isEmpty());

        System.out.println(c.size());
        System.out.println(c);
    }
}
