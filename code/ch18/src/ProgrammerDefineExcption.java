import java.util.Scanner;

/**
 * Exception 클래스를 상속하므로 예외 클래스
 * 상위 클래스인 Exception 클래스의 생성자 호출을 위해 super를 사용함
 *
 */
class AgeInputException extends Exception
{
    public AgeInputException()
    {
        super("유효하지 않은 나이가 입력되었습니다. ");
    }
}

public class ProgrammerDefineExcption
{
    public static void main(String[] args) {
        System.out.print("나이를 입력하세요 : ");

        try {
            // throws 에 의해 이동된 에외처리 포인트
            int age = readAge();
            System.out.println("당신은 " + age + "세 입니다.");
        }
        catch (AgeInputException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * throws AgeInputException --> AgeInputException 예외는 던져버린다.
     *
     * 이것의 의미는 readAge 메소드에서는 AgeInputException 에 대한 예외상황을 처리하지 않으니,
     * 이 메소드를 호출하는 영역에서는 AgeInputException 에 대한 처리도 대비해야 한다.
     *
     */
    public static int readAge() throws AgeInputException
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 0)
        {
            AgeInputException exception = new AgeInputException();

            // 예외 클래스의 참조변수(참조 값)를 피연산자로 하여 throw문을 구성함
            // throw는 예외상황이 발생되었음을 자바 가상머신에게 알리는 키워드
            // 따라서 이 문장이 실행되면서 자바의 예외처리 매커니즘이 동작하게 된다.

            // 이 부분을 try ~ catch 문으로 감싸서 예외상황을 처리할 수 있는데, 여기서는 그러지 않음
            // 이러한 경우 예외의 처리는 throw문이 존재하는 메소드(여기서는 readAge 메소드)를 호출한 영역으로 넘겨지게 된다.
            // 그래서 main에서 readAge 메소드 호출문장을 try~catch문으로 감싸는 것.
            throw exception;
        }
        return age;
    }
}
