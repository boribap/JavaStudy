import java.util.Scanner;

/**
 *  1. 자바 가상머신이 0으로 나누는 예외상황이 발생했음을 인식
 *  2. 이 상황을 위해 정의된 ArtimeticException 클래스의 인스턴스를 생성한다.
 *  3. 이렇게 생성된 인스턴스의 참조 값을 catch 영역에 선언된 매개변수에 전달한다.
 *
 */
public class DivideByZero
{
    public static void main(String[] args) {
        System.out.println("두 개의 정수 입력 : ");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try {
            System.out.println("나눗셈 결과의 몫 : " + (num1/num2));
            System.out.println("나눗셈 결과의 나머지 : " + (num1%num2));
        }
        catch (ArithmeticException e){
            System.out.println("나눗셈 불가능");
            System.out.println(e.getMessage());
        }

        System.out.println("프로그램을 종료합니다. ");
    }
}
