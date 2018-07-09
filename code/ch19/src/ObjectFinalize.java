class Myname
{
    String objName;
    public Myname(String name)
    {
        objName = name;
    }

    protected void finalize() throws Throwable
    {
        // Object 클래스의 finalize 메소드에 반드시 실행되어야 하는 중요한 코드가 삽입되어 있을지도 모르니, 이를 호출하는 문장을 삽입하는 것
        super.finalize();
        System.out.println(objName + "이 소멸되었습니다. ");
    }
}

public class ObjectFinalize
{
    public static void main(String[] args) {
        Myname obj1 = new Myname("인스턴스 1");
        Myname obj2 = new Myname("인스턴스 2");

        // 생성된 인스턴스가 가비지 컬렉션의 대상이 되었다.
        // 그래서 소멸되는 과정에서 finalize 메소드가 호출될것을 기대함 but 호출되지 않았다.

        obj1 = null;
        obj2 = null;

        System.out.println("프로그램을 종료합니다. ");
        // 아래와 같은 메소드 호출을 통해서 명시적으로 가비지 컬렉션을 수행기켜야 한다.
        // 아래의 메소드가 호출되면 자바 가상머신은 가비지 컬렉션을 수행시켜서, 참조되지 않는 인스턴스들을 소멸시킨다.
        // System.gc();
        // 위의 메소드 만으로는 finalize 메소드의 호출을 100% 보장받을 수 없다.
        // 왜냐면, 가비지 컬렉션이 수행되더라도 상황에 따라서 인스턴스의 완전한 소멸은 유보될 수 있기 때문
        // 완전한 소멸이 유보된 인스턴스들의 finalize 메소드 호출은 아래와 같이 별도로 요청해야 한다.
        // System.runFinalization();
    }
}