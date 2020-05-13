package Object;

public class ObjectDemo01 {
    public static void main(String[] args) {
        Student01 st1 = new Student01();
        st1.setName("Ëï·ÉÁú");
        st1.setAge(28);

        Student01 st2 = new Student01();
        st2.setName("Ëï·ÉÁú");
        st2.setAge(28);

//        System.out.println(st1 == st2);

        System.out.println(st1.equals(st2));
    }
}
