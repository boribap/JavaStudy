class Rectangle
{
    int ulx, uly; //좌 상단 x,y 좌표
    int lrx, lry; //우 하단 x,y 좌표

    public void showArea()
    {
        int xLen = lrx - ulx;
        int yLen = lry - uly;
        System.out.println("넓이 : " + (xLen * yLen));
    }
}

public class RectangleTest
{
    public static void main(String[] args)
    {
        Rectangle rec = new Rectangle();
        rec.ulx = 22; rec.uly = 22;
        rec.lrx = 10; rec.lry = 10;
        rec.showArea();
    }
}
