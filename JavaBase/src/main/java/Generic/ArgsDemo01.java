package Generic;

public class ArgsDemo01 {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));

        System.out.println(sum(10,20,30,40,50));
        System.out.println(sum(10,20,30,40,50,60));
        System.out.println(sum(10,20,30,40,50,60,70));
        System.out.println(sum(10,20,30,40,50,60,70,80));
        System.out.println(sum(10,20,30,40,50,60,70,80,90));

    }

    public static int sum(int... a){
        int sum = 0;
        for( int i : a){
            sum += i;
        }
        return sum;
    }

    /*public static int sum(int a ,int b){
        return a + b;
    }

    public static int sum(int a ,int b,int c){
        return a + b + c;
    }

    public static int sum(int a ,int b,int c,int d){
        return a + b + c +d;
    }*/
}
