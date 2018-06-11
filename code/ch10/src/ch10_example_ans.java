// 문제 해결의 요점은 인스턴스를 단 한개만 만들 수 있게 하는 것
// 그러기 위해서 인스턴스를 한개만 생성해 놓은 후, getSimpleNumberInst 메소드가 호출될때마다 이 만들어놓은 인스턴스의 참조변수를 반환하는 것.

class SimpleNumber_ans
{
    int num = 0;
    // 생성자 private
    private SimpleNumber_ans(){}
    public void addNum(int n)
    {
        num += n;
    }
    public void showNum()
    {
        System.out.println(num);
    }

    private static SimpleNumber_ans snInst = null;

    public static SimpleNumber_ans getSimpleNumberInst()
    {
        if (snInst == null)
        {
            snInst = new SimpleNumber_ans();
        }

        return snInst;
    }
}

class OnlyOneInstance_ans
{
    public static void main(String[] args)
    {
        SimpleNumber_ans num1 = SimpleNumber_ans.getSimpleNumberInst();
        num1.addNum(20);

        SimpleNumber_ans num2 = SimpleNumber_ans.getSimpleNumberInst();
        num2.addNum(30);

        num1.showNum(); // 20 출력
        num2.showNum(); // 30 출력
    }
}

public class ch10_example_ans
{
}
