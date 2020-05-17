package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo03 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();

        Student s1 = new Student("����",10);
        Student s2 = new Student("������",15);
        Student s3 = new Student("����",16);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        //���������������еı�����ʽ
        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName() + "," +s.getAge());
        }

        System.out.println("--------");

        //��ͨfor��ʽ�����������ı�����ʽ
        for( int i=0;i<list.size();i++){
            Student s = list.get(i);
            System.out.println(s.getName() + "," +s.getAge());
        }

        System.out.println("--------");

        //��ǿforѭ�������ı�����ʽ
        for(Student s :list){
            System.out.println(s.getName() + "," +s.getAge());
        }
    }
}
