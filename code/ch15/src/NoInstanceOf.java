class BoxNo
{
    public void SimpleWrap()
    {
        System.out.println("simple wrap");
    }
    public void wrap()
    {
        SimpleWrap();
    }
}

class PaperBoxNo extends BoxNo
{
    public void PaperWrap()
    {
        System.out.println("paper wrap");
    }
    public void wrap()
    {
        PaperWrap();
    }
}

class GoldPaperBoxNo extends PaperBoxNo
{
    public void GoldPaperWrap()
    {
        System.out.println("goldpaper wrap");
    }
    public void wrap()
    {
        GoldPaperWrap();
    }
}

public class NoInstanceOf
{
    public static void wrapBox(BoxNo box)
    {
       box.wrap();
    }

    public static void main(String[] args)
    {
        BoxNo box1 = new BoxNo();
        PaperBoxNo box2 = new PaperBoxNo();
        GoldPaperBoxNo box3 = new GoldPaperBoxNo();

        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);
    }
}
