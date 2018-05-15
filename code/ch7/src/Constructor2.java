class NumberParam
{
    int num;
    public NumberParam(int n)
    {
        num = n;
        System.out.println("인자전달 : "+ n);
    }
    public int getNumber()
    {
        return num;
    }
}

public class Constructor2
{
    public static void main(String [] args)
    {
        NumberParam num1=new NumberParam(10);
        System.out.println("메소드 반환값 : " + num1.getNumber());
    }
}