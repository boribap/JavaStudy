class Number
{
    public int num;
    public Number(int num) {this.num = num;}
    public int getNum() {return num;}
}
public class EnhancedForInst
{
    public static void main(String [] args)
    {
        Number[] arr = new Number[] {
                new Number(2),
                new Number(4),
                new Number(8)
        };

        // 배열에 저장되어 있는 인스턴스 멤버변수 num의 값을 1씩 증가시키고 있음.
        // 이는 배열에 저장되어 있는 참조 값을 통해서, 인스턴스의 값을 변경시킨것.
        // 즉 배열에 저장된 참조값을 변경시킨것이 아니기 때문에, 인스턴스의 값은 실제 변경이 일어남.
        // (for-each문은 배열에 저장된 참조값 변경 불가)
        for (Number e : arr)
        {
            e.num++;
        }

        for (Number e : arr)
        {
            System.out.print(e.getNum() + " ");
        }
        System.out.println("");

        // 배열의 참조를 위해 선언된 변수 e의 값을 변경시키고 있음
        // for-each 내에서 변경된 e값이므로 그 안에서만 유효. 그래서 이 문장을 통해 이뤄진 연산의 결과는 실제 배열에 반영되지 않는다.
        for(Number e : arr)
        {
            e = new Number(5);
            e.num += 2;
            System.out.print(e.getNum() + " ");
        }
        System.out.println("");

        for (Number e : arr)
        {
            System.out.print(e.getNum()+ " ");
        }
    }
}
