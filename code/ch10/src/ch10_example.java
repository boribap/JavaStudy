// 클래스 중에서 반드시 하나의 인스턴스만 생성해야 하는 클래스도 존재.
// 어떠한 상황에서건 반드시 하나의 인스턴스만 생성 가능한 클래스의 정의 방법을 이문제를 통해 알아볼 것.
// 이것을 실행시켜 보면 num1과 num2가 참조하고 있는 인스턴스는 각각 다르다.
// 문제 ) num1 과 num2가 참조하는 인스턴스가 같도록 만들어보아라

class SimpleNumber
{
    int num = 0;
    // 생성자 private
    private SimpleNumber(){}
    public void addNum(int n)
    {
        num += n;
    }
    public void showNum()
    {
        System.out.println(num);
    }

    public static SimpleNumber getSimpleNumberInst()
    {
        return new SimpleNumber();
    }
}

class OnlyOneInstance
{
    public static void main(String[] args)
    {
        SimpleNumber num1 = SimpleNumber.getSimpleNumberInst();
        num1.addNum(20);

        SimpleNumber num2 = SimpleNumber.getSimpleNumberInst();
        num2.addNum(30);

        num1.showNum(); // 20 출력
        num2.showNum(); // 30 출력
    }
}

public class ch10_example
{
}
