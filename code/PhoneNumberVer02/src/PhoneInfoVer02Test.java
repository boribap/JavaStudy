import java.util.Scanner;

class PhoneInfo
{
    String name;
    String phoneNumber;
    String birthday;

    public PhoneInfo(String name, String phoneNumber, String birthday){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }
    public PhoneInfo(String name_nb, String phoneNumber_nb){
        this(name_nb,phoneNumber_nb,null);
    }

    public void showInfo()
    {
        System.out.println("전화번호 정보");
        System.out.println("이름 : " + name );
        System.out.println("전화번호 : " + phoneNumber);
        if (birthday != null)
        {
            System.out.println("생년월일 : " + birthday);
        }
        System.out.println(" ");
    }
}

public class PhoneInfoVer02Test
{
    static Scanner keyboard = new Scanner(System.in);

    public static void ShowMenu()
    {
        System.out.println("선택하세요..");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 프로그램 종료");
        System.out.println("선택 : ");
    }

    public static void readData()
    {
        System.out.println("이름 : ");
        String name = keyboard.nextLine();
        System.out.println("전화번호 : ");
        String phoneNum = keyboard.nextLine();
        System.out.println("생년월일 : ");
        String birth = keyboard.nextLine();
        System.out.println("입력된 정보 출력...");

        PhoneInfo person = new PhoneInfo(name, phoneNum, birth);
        person.showInfo();
    }

    public static void main(String [] args)
    {
        while(true)
        {
            ShowMenu();
            int ch = keyboard.nextInt();
            keyboard.nextLine();

            if (ch == 1)
            {
                readData();
            }
            else if(ch == 2)
            {
                System.out.println("프로그램 종료");
                break;
            }
        }

    }
}
