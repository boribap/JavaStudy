class Rectangle
{
    private int ulx, uly; //좌 상단 x,y 좌표
    private int lrx, lry; //우 하단 x,y 좌표

    private boolean isProperRange(int pos)
    {
        if(pos >= 0 && pos <= 100) {
            return true;
        }else {
            return false;
        }
    }

    public void setRectanglePoint(int lx, int ly, int rx, int ry)
    {
        if(rx <= lx || ry <= ly)
        {
            System.out.println("잘못된 좌표값");
            return;
        }
        if(!isProperRange(lx) || !isProperRange(ly))
        {
            System.out.println("좌상단의 좌표 범위가 잘못되었습니다.");
            return;
        }
        if (!isProperRange(rx) || !isProperRange(ry))
        {
            System.out.println("우상단의 좌표 범위가 잘못되었습니다.");
            return;
        }

        ulx = lx; uly = ly;
        lrx = rx; lry = ry;
    }

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
        rec.setRectanglePoint(-3,-1,2,7);
        rec.showArea();

        rec.setRectanglePoint(2,2,8,8);
        rec.showArea();
    }
}
