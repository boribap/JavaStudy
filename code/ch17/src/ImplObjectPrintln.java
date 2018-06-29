class ClassPrinter
{
    // 매개변수형이 Object이므로 모든 인스턴스의 참조값은 이 메소드에 전달될 수 있다.
    public static void print(Object obj){
        System.out.println(obj.toString());
    }
}

class Point
{
    private int xPos, yPos;

    Point(int x, int y)
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

public class ImplObjectPrintln
{
    public static void main(String[] args) {
        Point pos1 = new Point(1,2);
        Point pos2 = new Point(5,9);

        ClassPrinter.print(pos1);
        ClassPrinter.print(pos2);
    }
}
