package Object;

public class ObjectDemo01 {
    public static void main(String[] args) {
        Student01 st1 = new Student01();
        st1.setName("�����");
        st1.setAge(28);

        Student01 st2 = new Student01();
        st2.setName("�����");
        st2.setAge(28);

//        System.out.println(st1 == st2);

        System.out.println(st1.equals(st2));
    }
}
