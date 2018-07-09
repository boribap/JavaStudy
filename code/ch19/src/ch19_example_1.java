class Point
{
    int xPos, yPos;

    public Point(int x, int y)
    {
        xPos = x;
        yPos = y;
    }

    public void showPosition()
    {
        System.out.printf("[%d,%d]", xPos, yPos);
    }

    @Override
    public boolean equals(Object obj) {
        Point compare = (Point)obj;

        if (xPos == compare.xPos && yPos == compare.yPos)
        {
            return true;
        }
        else {
            return false;
        }
    }
}

class Rectangle
{
    Point upperLeft, lowerRight;

    public Rectangle(int x1, int y1, int x2, int y2)
    {
        upperLeft = new Point(x1, y1);
        lowerRight = new Point(x2, y2);
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle rectangle = (Rectangle)obj;
        if (upperLeft.equals(rectangle.upperLeft) && lowerRight.equals(rectangle.lowerRight))
        {
            return true;
        }
        else {
            return false;
        }
    }

    public void showPosition()
    {
        System.out.println("직사각형 위치정보...");
        System.out.print("좌 상당 : ");
        upperLeft.showPosition();
        System.out.println("");
        System.out.print("우 하단 : ");
        lowerRight.showPosition();
        System.out.println("\n");
    }
}

public class ch19_example_1
{
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(1,2,8,9);
        Rectangle rec2 = new Rectangle(2,3,5,5);
        Rectangle rec3 = new Rectangle(1,2,8,9);

        rec1.showPosition();
        rec2.showPosition();
        rec3.showPosition();


    }
}
