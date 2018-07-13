public class BoxingNUnboxing
{
    public static void main(String[] args) {
        // 수동으로 박싱
        Integer ivalue = new Integer(10);
        // 자바 버전5부터 자동으로 박싱
        Integer avalue = 10;

        // 메소드 호출함으로써 수동으로 언박싱
        ivalue = new Integer(ivalue.intValue() + 10);
        // 자바 버전 5부터 자동으로 언박싱 (자동으로 avalue.intValue() 가 호출됨)
        int num1 = avalue;
    }
}
