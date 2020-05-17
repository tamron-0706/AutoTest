package Exception;

public class Teacher {
    public void checkExceptionDemo2(int exceptionDemo2) throws ExceptionDemo2{
        if(exceptionDemo2<0 || exceptionDemo2 >100){
            throw new ExceptionDemo2("您给的分数有误，分数在0-100之间。");
        }else {
            System.out.println("分数正常");
        }
    }
}
