package Exception;

import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) throws ExceptionDemo2 {
        Scanner sc = new Scanner(System.in);
        System.out.println("«Î ‰»Î∑÷ ˝£∫");
        int score = sc.nextInt();
        Teacher t = new Teacher();

        t.checkExceptionDemo2(score);
    }
}
