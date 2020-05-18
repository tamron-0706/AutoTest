package Hash;

import java.util.HashSet;

public class HashDemo01 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<Student>();

        Student s1 = new Student("林青霞",16);
        Student s2 = new Student("李小龙",17);
        Student s3 = new Student("霍元甲",20);

        Student s4 = new Student("李小龙",17);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        for(Student s : hs){
            System.out.println(s.getName() + "," + s.getAge());
        }

    }
}
