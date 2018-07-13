public class ch20_example_1
{
    public static void main(String[] args) {
        //Integer val = new Integer(10);
        Integer iValue1 = Integer.valueOf(10);
        Integer iValue2 = Integer.valueOf(10);

        if (iValue1 == iValue2)
        {
            System.out.println("iValue1과 iValue는 동일 인스턴스 참조");
        }
        else {
            System.out.println("iValue1과 iValue는 다른 인스턴스 참조");
        }
    }
}
