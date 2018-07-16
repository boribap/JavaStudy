interface SimpleInterface
{
    public void showYourName();
}

class  UpperClass
{
    public void showYourAncestor()
    {
        System.out.println("Upper Class");
    }
}

class AAAA extends UpperClass implements SimpleInterface
{
    public void showYourName()
    {
        System.out.println("Class AAAA");
    }
}

class BBBB extends UpperClass implements SimpleInterface
{
    public void showYourName()
    {
        System.out.println("Class BBBB");
    }
}

public class BoundedTypeParam
{
    /**
     * 이렇게 하면 제네릭의 장점 소멸
     * SimpleInterface 인터페이스를 구현하지 않은 인스턴스의 참조값이 메소드에 전달되어도 컴파일 및 실행이 진행되기 때문
     *
     */
    /*public static <T> void showInstanceAncestor(T param)
    {
        ((SimpleInterface)param).showYourName();
    }*/

    // 제네릭의 장점을 지키고자 이렇게 함
    public static <T extends SimpleInterface> void showInstanceAncestor(T param)
    {
        param.showYourName();
    }

    public static <T> void showInstanceName(T param)
    {
        ((UpperClass)param).showYourAncestor();
    }
    public static void main(String[] args) {
        AAAA aaa = new AAAA();
        BBBB bbb = new BBBB();

        showInstanceAncestor(aaa);
        showInstanceName(aaa);
        showInstanceAncestor(bbb);
        showInstanceName(bbb);
    }
}
