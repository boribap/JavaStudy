class Circle
{
    // 변경되지 않으면서 참조의 용도로만 사용되는것
    // private으로 되어있지 않음 --> 어차피 변경할 수 없는 값 + 외부 접근 허용함으로 인해 PI라는 상수값이 프로그램 상에서 하나만 존재할 수 있기 때문에 의미있는 일.
    static final double PI = 3.14;
    private double radius;

    public Circle(double rad)
    {
        radius = rad;
    }
    public void showPerimeter()
    {
        double peri = (radius*2)*PI;
        System.out.println("둘레 : " + peri);
    }
    public void showArea()
    {
        double area = radius * radius * PI;
        System.out.println("넓이 : "+ area);
    }
}
public class StaticUse
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(1.2);
        c1.showPerimeter();
        c1.showArea();
    }
}
