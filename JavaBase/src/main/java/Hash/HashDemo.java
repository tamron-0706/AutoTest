package Hash;

public class HashDemo {
    public static void main(String[] args) {
        Student s1 = new Student("林青霞",16);

        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println("--------");
        Student s2 = new Student("林青霞",16);
        System.out.println(s2.hashCode());
        System.out.println("--------");
        System.out.println("hello".hashCode());
        System.out.println("world".hashCode());
        System.out.println("java".hashCode());
        System.out.println("world".hashCode());
        System.out.println("--------");
        System.out.println("通话".hashCode());
        System.out.println("重地".hashCode());

    }
}
