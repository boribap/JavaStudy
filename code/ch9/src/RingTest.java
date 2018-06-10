class Point
{
    int xPos, yPos;
    public Point(int x, int y)
    {
        xPos = x;
        yPos = y;
    }
    public void showPointInfo()
    {
        System.out.println("["+xPos+","+yPos+"]");
    }
}

class Circle
{
    int rad;
    Point center;

    public Circle(int x, int y, int r)
    {
        rad = r;
        center = new Point(x,y);
    }
    public void showCircleInfo()
    {
        System.out.println("radius : " + rad);
        center.showPointInfo();
    }
}
class Ring
{
    Circle innerCircle;
    Circle outerCircle;

    public Ring(int Ix, int Iy, int Ir, int Ox, int Oy, int OR)
    {
        innerCircle = new Circle(Ix, Iy, Ir);
        outerCircle = new Circle(Ox,Oy,OR);
    }
    public void showRingInfo()
    {
        System.out.println("InnerInfo");
        innerCircle.showCircleInfo();
        System.out.println("OuterInfo");
        outerCircle.showCircleInfo();
    }
}
public class RingTest
{
    public static void main(String[] args)
    {
        Ring ring = new Ring(1,1,4,2,2,9);
        ring.showRingInfo();
    }
}
