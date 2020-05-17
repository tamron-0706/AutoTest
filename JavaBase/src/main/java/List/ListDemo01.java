package List;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("hello");

//        System.out.println(list);

//        list.add(1,"javaee");
//        list.add(11,"list");

        list.remove(1);

        list.set(1,"javaee");





        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String l = it.next();
            System.out.println(l);

        }

    }
}
