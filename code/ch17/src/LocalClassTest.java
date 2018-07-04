interface Readable
{
    public void read();
}

class OuterClass
{
    private String myname;

    OuterClass(String name)
    {
        myname = name;
    }

    public Readable createLocalClassInst()
    {
        class LocalClass implements Readable
        {
            public void read()
            {
                System.out.println("Outer inst name : " + myname);
            }
        }
        return new LocalClass();
    }
}

public class LocalClassTest
{
    public static void main(String[] args) {
        OuterClass out1 = new OuterClass("First");
        //localclass의 인스턴스 만드는 과정
        Readable localInst1 = out1.createLocalClassInst();
        localInst1.read();

        OuterClass out2 = new OuterClass("Second");
        Readable localInst2 = out2.createLocalClassInst();
        localInst2.read();
    }
}
