class OuterClassOne
{
    OuterClassOne()
    {
        NestedClass nst = new NestedClass();
        nst.simpleMethod();
    }

    static class NestedClass
    {
        public void simpleMethod()
        {
            System.out.println("Nested Instance Method One");
        }
    }
}

class OuterClassTwo
{
    OuterClassTwo()
    {
        NestedClass nst = new NestedClass();
        nst.simpleMethod();
    }

    private static class NestedClass
    {
        public void simpleMethod()
        {
            System.out.println("Nested Instance Method Two");
        }
    }
}

public class NestedClassTest
{
    public static void main(String[] args) {
        OuterClassOne one = new OuterClassOne();
        OuterClassTwo two = new OuterClassTwo();

        OuterClassOne.NestedClass nst1 = new OuterClassOne.NestedClass();
        nst1.simpleMethod();

        // OuterClassTwo.NestedClass nst2 = new OuterClassTwo.NestedClass();
    }
}
