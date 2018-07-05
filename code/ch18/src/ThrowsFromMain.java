import java.util.Scanner;

class AgeInputException1 extends Exception
{
    public AgeInputException1()
    {
        super("유효하지 않은 나이가 입력되었습니다. ");
    }
}

public class ThrowsFromMain
{
    public static void main(String[] args) throws AgeInputException1
    {
        System.out.print("나이를 입력하세요 : ");
        int age = readAge();
        System.out.println("당신은 " + age + "세 입니다.");
    }

    public static int readAge() throws AgeInputException1
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 0)
        {
            AgeInputException1 exception = new AgeInputException1();
            throw exception;
        }
        return age;
    }
}