class IntNumber
{
    int num;

    public IntNumber(int num)
    {
        this.num = num;
    }

    public boolean isEquals(IntNumber numObj)
    {
        if (this.num == numObj.num)
        {
            return true;
        }
        else {
            return false;
        }
    }
}

public class ObjectEquality
{
    public static void main(String[] args) {
        IntNumber num1 = new IntNumber(10);
        IntNumber num2 = new IntNumber(12);
        IntNumber num3 = new IntNumber(10);

        if (num1.isEquals(num2))
        {
            System.out.println("num1과 num2는 동일한 정수");
        }
        else {
            System.out.println("num1과 num2는 다른 정수");
        }

        if (num1.isEquals(num3))
        {
            System.out.println("num1과 num3는 동일한 정수 ");
        }
        else {
            System.out.println("num1과 num3는 다른 정수");
        }

        if(num1 == num3)
        {
            System.out.println("참조변수가 같다");
        }
        else{
            System.out.println("참조변수가 다르다");
        }
    }
}
