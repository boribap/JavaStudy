interface readable
{
    public void read();
}

class outerclass
{
    private String myName;

    outerclass(String name)
    {
        myName = name;
    }

    public readable createlocalClassInst(final int instID)
    {
        class localclass implements readable
        {
            public void read()
            {
                System.out.println("Outer inst name : " + myName);
                System.out.println("Iocal inst ID : " + instID);
            }
        }
        return new localclass();
    }

}

public class LocalParamClassTest
{
    public static void main(String[] args) {
        outerclass out = new outerclass("First");
        readable localinst1 = out.createlocalClassInst(1);
        localinst1.read();

        readable localinst2 = out.createlocalClassInst(2);
        localinst2.read();
    }
}
