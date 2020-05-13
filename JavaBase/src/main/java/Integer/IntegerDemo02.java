package Integer;

public class IntegerDemo02 {
    public static void main(String[] args) {
        int num = 100;

        /*String s1 = "" +num;
        System.out.println(s1);*/

//        System.out.println(String.valueOf(num));

        String s = "100";
        Integer i1 = Integer.valueOf(s);
        System.out.println(i1.intValue());
        System.out.println("--------");
        int y = Integer.parseInt(s);
        System.out.println(y);
    }
}
