package Exception;

public class Teacher {
    public void checkExceptionDemo2(int exceptionDemo2) throws ExceptionDemo2{
        if(exceptionDemo2<0 || exceptionDemo2 >100){
            throw new ExceptionDemo2("�����ķ������󣬷�����0-100֮�䡣");
        }else {
            System.out.println("��������");
        }
    }
}
