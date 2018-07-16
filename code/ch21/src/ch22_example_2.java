class Myclass
{
    public <T> void simpleMethod(T param)
    {
        // showData라는 메소드가 존재해야 가능한 문장
        // 즉, 모든 자료형을 기반으로 실행 가능한 문장이 아니기 때문에 컴파일에러가 발생한다.
        // param.showData();
        System.out.println(param);
    }
}

public class ch22_example_2
{
    public static void main(String[] args) {

    }
}
