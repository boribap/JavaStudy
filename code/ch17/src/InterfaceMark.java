// ImplObjectPrintln 에 기능 추가

/**
 * 인터페이스 UpperCasePrintable 을 구현하는 클래스의 인스턴스가 print 메소드의 인자로 전달되면 문자열을 전부 대문자로 출력한다.
 */

interface UpperCasePrintable{

}

class ClassPrinter_
{
    // 매개변수형이 Object이므로 모든 인스턴스의 참조값은 이 메소드에 전달될 수 있다.
    public static void print(Object obj){
        String org = obj.toString();

        // UpperCasePrintable 인터페이스를 구현하는 클래스의 인스턴스인지 확인
        if(obj instanceof UpperCasePrintable){
            org = org.toUpperCase();
        }
        System.out.println(org);
    }
}

/**
 * UpperCasePrintable 인터페이스를 구현하는 클래스
 * 인터페이스가 비어있기 때문에 별도로 구현할 메소드는 없음
 */
class PointOne implements UpperCasePrintable
{
    private int xPos, yPos;

    PointOne(int x, int y)
    {
        xPos = x;
        yPos = y;
    }
    // Object클래스에 정의되어 있는 메소드를 오버라이딩 한것
    @Override
    public String toString() {
        String posInfo="[ x : " + xPos + ", y : " + yPos + "]";
        return posInfo;
    }
}

/**
 * UpperCasePrintable 인터페이스를 구현하는 클래스 아님
 */
class PointTwo
{
    private int xPos, yPos;

    PointTwo(int x, int y)
    {
        xPos = x;
        yPos = y;
    }
    // Object클래스에 정의되어 있는 메소드를 오버라이딩 한것
    @Override
    public String toString() {
        String posInfo="[ x : " + xPos + ", y : " + yPos + "]";
        return posInfo;
    }
}

public class InterfaceMark
{
    public static void main(String[] args) {
        PointOne pos1 = new PointOne(1,2);
        PointTwo pos2 = new PointTwo(5,9);

        ClassPrinter_.print(pos1);
        ClassPrinter_.print(pos2);
    }
}
