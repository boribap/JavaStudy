import java.util.Scanner;

/**
 * 예외 클래스 정의
 */
class AgeInputException2 extends Exception
{
    public AgeInputException2()
    {
        super("유효하지 않은 나이가 입력되었습니다. ");
    }
}

/**
 * 예외 클래스 정의
 * but, 예외의 원인이 된 이름정보를 저장할 수 있는 인스턴스 변수가 삽입됨.
 *
 * 예외 클래스는 예외상황과 관련해서 필요한 정보를 담을 수 있도록 정의할 수 있다.
 */
class NameLengthException extends Exception
{
    String wrongName;

    public NameLengthException(String name)
    {
        super("잘못된 이름이 삽입되었습니다. ");
        wrongName = name;
    }

    public void showWrongName()
    {
        System.out.println("잘못 입력된 이름 : " + wrongName);
    }
}

class PersonalInfo
{
    String name;
    int age;

    public PersonalInfo(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void showPersonalInfo()
    {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}

public class PrintStackTrace
{
    public static Scanner sc = new Scanner(System.in);

    /**
     * AgeInputException2 와 NameLengthException 예외를 처리하기 위한 catch 구문이 존재
     * 해당 구문에서 printstacktrace 메소드를 호출함 (예외가 발생한 정확한 위치와 예외가 전달되어 온 과정를 확인할 수 있다.)
     *
     */
    public static void main(String[] args) {

        try {
            PersonalInfo readInfo = readPersonalInfo();
            readInfo.showPersonalInfo();
        }
        catch (AgeInputException2 e){
            e.printStackTrace();
        }
        catch (NameLengthException e){
            e.showWrongName();
            e.printStackTrace();
        }
    }

    /**
     *
     * throws 는 AgeInputException2 , NameLengthException 와같이 두개 이상의 예외 클래스에 대해서도 선언 가능
     */
    public static PersonalInfo readPersonalInfo() throws AgeInputException2, NameLengthException
    {
        String name = readName();
        int age = readAge();
        PersonalInfo personalInfo = new PersonalInfo(name, age);
        return personalInfo;
    }

    public static String readName() throws NameLengthException
    {
        System.out.print("이름 입력 : ");
        String name = sc.nextLine();
        if (name.length() < 2)
        {
            throw new NameLengthException(name);
        }
        return name;
    }

    public static int readAge() throws AgeInputException2
    {
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();

        if (age < 0)
        {
            throw new AgeInputException2();
        }
        return age;
    }
}
