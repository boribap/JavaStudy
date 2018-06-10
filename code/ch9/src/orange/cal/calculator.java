package orange.cal;

public class calculator
{
    private Adder adder;
    private Subtractor subtractor;

    public calculator()
    {
        adder = new Adder();
        subtractor = new Subtractor();
    }

    public int addTwoNumber(int num1, int num2)
    {
        return adder.addTwoNumber(num1, num2);
    }

    public int subTwoNumber(int num1, int num2)
    {
        return subtractor.subTwoNumber(num1, num2);
    }

    public void showOperatingTimes()
    {
        System.out.println("덧셈횟수 : " + adder.getCntAdd());
        System.out.println("뺄셈횟수 : " + subtractor.getCntSub());
    }
}

//Adder와 Subtractor는 calculator를 만들기위한 부수적인(?)것 --> 이렇게 라이브러리 형태 --> public사용

class Adder
{
    private int cntAdd;

    Adder()
    {
        cntAdd = 0;
    }

    int getCntAdd()
    {
        return cntAdd;
    }

    int addTwoNumber(int num1, int num2)
    {
        cntAdd++;
        return num1 + num2;
    }
}

class Subtractor
{
    private int cntSub;

    Subtractor()
    {
        cntSub = 0;
    }

    int getCntSub()
    {
        return cntSub;
    }

    int subTwoNumber(int num1, int num2)
    {
        cntSub++;
        return num1 - num2;
    }
}
