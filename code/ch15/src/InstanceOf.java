class Box
{
    public void simpleWrap()
    {
        System.out.println("simple wrap");
    }
}

class PaperBox extends Box
{
    public void paperWrap()
    {
        System.out.println("paper wrap");
    }
}

class GoldPaperBox extends PaperBox
{
    public void goldWrap()
    {
        System.out.println("goldpaper wrap");
    }
}

public class InstanceOf
{
    public static void wrapBox(Box box)
    {
        if(box instanceof GoldPaperBox) //box 가 GoldPaperBox로 형변환이 가능하다면 = box가 참조하는 인스턴스가 PaperBox, 또는 GoldPaperBox를 상속하는 클래스의 인스턴스라면
        {
            ((GoldPaperBox)box).goldWrap();
        }
        else if(box instanceof PaperBox)
        {
            ((PaperBox)box).paperWrap();
        }
        else
        {
            box.simpleWrap();
        }
    }

    public static void main(String[] args)
    {
        Box box1 = new Box();
        PaperBox box2 = new PaperBox();
        GoldPaperBox box3 = new GoldPaperBox();

        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);
    }
}
