class AccessWay
{
    static int num = 0;
    AccessWay()
    {
        increaseCnt();
    }
    // 방법 1. 클래스 내부에서는 얼마든지 직접 접근 가능
    public void increaseCnt()
    {
        num++;
    }
}
public class StaticAccessWay
{
    public static void main(String[] args)
    {
        AccessWay way = new AccessWay();
        // 방법 2. 인스턴스 이름으로 접근
        // 그러나 이 방법을 사용한 접근은 인스턴스 변수의 접근방법과 같기 때문에 방법 3. 과 같이 하는것을 선호
        way.num++;
        // 방법 3. 클래스의 이름으로 접근
        AccessWay.num++;
        System.out.println("num="+ AccessWay.num);
    }
}
