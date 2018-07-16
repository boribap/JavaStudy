class AAA
{
    @Override
    public String toString() {
        return "Class AAA";
    }
}

class BBB
{
    @Override
    public String toString() {
        return "Class BBB";
    }
}

class InstanceTypeShower
{
    int showcnt = 0;

    // 메소드가 제네릭으로 정의되었다.
    public <T> void showInstType(T inst)
    {
        System.out.println(inst);
        showcnt++;
    }

    void showPrintcnt()
    {
        System.out.println("Showcnt : " + showcnt);
    }
}

public class IntroGenericMethod
{
    public static void main(String[] args) {
        AAA aaa = new AAA();
        BBB bbb = new BBB();

        InstanceTypeShower shower = new InstanceTypeShower();
        // <AAA> 없어도 가능
        shower.<AAA>showInstType(aaa);
        shower.<BBB>showInstType(bbb);
        shower.showPrintcnt();
    }
}
