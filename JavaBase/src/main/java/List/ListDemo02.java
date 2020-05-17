package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//ConcurrentModificationException:并发修改异常


public class ListDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("你好");

       /*
       //ConcurrentModificationException:并发修改异常
       Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            if(s.equals("world")){
                list.add("javaee");
            }
        }*/

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.equals("world")) {
                list.add("javaee");
            }
        }
        System.out.println(list);

    }
}
