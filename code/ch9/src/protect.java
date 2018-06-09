class AAA
{
    private int num;
    protected int num1;
}

class BBB extends AAA
{
    public void init(int n)
    {
        num = n;
        num1 = n;
    }
}

public class protect
{
    //protected로 선언된 AAA class의 인스턴스 변수는 BBB가 상속받으면서, BBB 인스턴스가 생성되면, 이안에는 AAA의 멤버들도 존재하게 된다.
    //private로 하면 에러가 나는 이유 --> 접근제어 지시자에 의한 접근 허용여부는 인스턴스가 아닌 클래스를 기준으로 따지기 때문
}
