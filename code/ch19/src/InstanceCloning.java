class Point1 implements Cloneable
{
    private int xPos;
    private int yPos;

    public Point1(int x ,int y)
    {
        xPos = x;
        yPos = y;
    }

    public void showPosition()
    {
        System.out.printf("[%d, %d]", xPos, yPos);
        System.out.println(" ");
    }

    // 새로운 것 추가없이 super만을 썼는데 오버라이딩한 이유는?
    // clone은 protected이기 때문에 접근범위를 public으로 넓히기 위해서 사용하였다.
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

public class InstanceCloning
{
    public static void main(String[] args) {
        Point1 org = new Point1(5,3);
        Point1 cpy;

        try {
            cpy = (Point1)org.clone();
            org.showPosition();
            cpy.showPosition();

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
