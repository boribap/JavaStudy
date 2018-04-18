public class SCE
{
    public static void main(String[] args){
        int num1 = 0, num2 = 0;
        boolean result;

        result = (num1+=10) < 0 && (num2+=10) > 0;
        System.out.println("re= " + result);
        System.out.println("num1 =" + num1+ ", num2 =" + num2 );

        result = (num1+=10) < 0 || (num2+=10) > 0;
        System.out.println("re= " + result);
        System.out.println("num1 =" + num1+ ", num2 =" + num2 );
    }
}
/*
실행 결과 num2는 전혀 증가 되지 않는다. 그 이유는 &&연산에서는 num1 이 false이면 해당 문장은 끝까지 볼 필요가 없이 false가 되기 때문이다.
마찬가지로 ||연산을 보면 num1에서 이미 true가 나왔기 때문에 뒤는 보지 않아도 결과는 ture이다.
이런것을 보고 SCE라고 한다. 이렇게 num2가 증가가 전혀 되지 않는 것이 SCE의 부작용이다. 그래서 이런 문장이 구성되지 않도록 주의해야한다.
 */