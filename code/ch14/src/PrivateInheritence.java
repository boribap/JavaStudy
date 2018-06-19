// 수의 누적이 가능한 클래스
class Accumulator
{
    private int val;
    Accumulator (int init)
    {
        val = init;
    }
    protected void accumulate(int num)
    {
        if(num < 0)
        {
            return;
        }
        val = val + num;
    }
    protected int getAccVal()
    {
        return val;
    }
}

// 적금통장을 표현한 클래스
// 변수 val 에 직접적인 접근 불가 (private - 안정성을 보장하기 위해서 이것으로 선언)
// 대신에 Accumulator가 제공하는 protected 메소드를 통해서 안정적인 형태로 접근이 가능
class SavingAccount extends Accumulator
{
    public SavingAccount(int initDep)
    {
        // 적금통장 개설 시 입금액
        super(initDep);
    }
    public void saveMoney(int money)
    {
        // 돈의 입금
        accumulate(money);
    }
    public void showSaveMoney()
    {
        System.out.println("지금까지의 누적액 : ");
        System.out.println(getAccVal());
    }
}

public class PrivateInheritence
{
    public static void main(String [] args)
    {
        SavingAccount sa = new SavingAccount(1000);
        sa.saveMoney(1000);
        sa.saveMoney(1000);
        sa.showSaveMoney();
    }
}
