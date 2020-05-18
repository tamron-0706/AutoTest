package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo04 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");
        //遍历
        for(String s : array){
            System.out.println(s);
        }
        System.out.println("-------");
        for(int i =0;i<array.size();i++){
            String s = array.get(i);
            System.out.println(s);
        }
        System.out.println("--------");
        Iterator<String> it =  array.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("--------");

        LinkedList<String> link = new LinkedList<String>();

        link.add("hello");
        link.add("world");
        link.add("java");
        //遍历
        for(String l : link){
            System.out.println(l);
        }

    }
}
