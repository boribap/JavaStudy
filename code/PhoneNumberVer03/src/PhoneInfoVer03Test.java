import java.util.Scanner;

class PhoneInfo
{
    String name;
    String phoneNumber;
    String birthday;

    public PhoneInfo(String name, String phoneNumber, String birthday)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }

    public PhoneInfo(String p_name, String p_phoneNumber)
    {
        this(p_name, p_phoneNumber, null);
    }

    public void ShowData()
    {
        System.out.println("전화번호부");
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " + phoneNumber);
        if(birthday != null){
            System.out.println("생년원일 : " + birthday);
        }
    }
}

class PhoneBookManager
{
    final int MAX_SIZE = 100;
    //배열의 자료형은 class도 가능하다는것...!
    PhoneInfo [] phoneArr = new PhoneInfo[MAX_SIZE];
    //cnt이용해서 숫자 세기 (삽입 +1 삭제 -1)
    int cnt = 0;

    public PhoneBookManager() { }

    public void DataStore()
    {
        System.out.println("데이터 입력을 시작합니다..");

        System.out.println("이름 : ");
        String rName = PhoneInfoVer03Test.keyboard.nextLine();
        System.out.println("전화번호 : ");
        String rPhoneNumber = PhoneInfoVer03Test.keyboard.nextLine();
        System.out.println("생년월일 : ");
        String rBirth = PhoneInfoVer03Test.keyboard.nextLine();

        phoneArr[cnt] = new PhoneInfo(rName, rPhoneNumber, rBirth);
        cnt++;

        System.out.println("데이터 입력이 완료되었습니다. \n");
    }

    public void DataSearch()
    {
        System.out.println("데이터 검색을 시작합니다..");
        System.out.println("이름 : ");
        String SearchName = PhoneInfoVer03Test.keyboard.nextLine();
        int flag = 0;

        for (int i = 0; i < cnt; i ++)
        {
            if(phoneArr[i].name.equals(SearchName))
            {
                phoneArr[i].ShowData();
                flag = 1;
            }
        }

        if(flag == 0)
        {
            System.out.println("해당 데이터가 존재하지 않습니다.");
        }

        System.out.println("데이터 검색이 완료되었습니다. \n");
    }

    public void DataDelete()
    {
        System.out.println("데이터를 삭제를 시작합니다..");

        System.out.println("이름 : ");
        String deleteName = PhoneInfoVer03Test.keyboard.nextLine();
        int flag = 0;

        for (int i = 0; i < cnt; i++)
        {
            if(phoneArr[i].name.equals(deleteName))
            {
                phoneArr[i] = phoneArr[i+1];
                cnt--;
                flag = 1;
            }
        }

        if(flag == 0)
        {
            System.out.println("해당 데이터가 존재하지 않습니다.");
        }

        System.out.println("데이터 삭제가 완료되었습니다. \n");
    }
}

public class PhoneInfoVer03Test
{
    static Scanner keyboard = new Scanner(System.in);

    public static void SelectNum()
    {
        System.out.println("선택하세요...");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 데이터 검색");
        System.out.println("3. 데이터 삭제");
        System.out.println("4. 프로그램 종료");
        System.out.println("선택 : ");
    }

    public static void main(String[] args)
    {
        PhoneBookManager manager = new PhoneBookManager();

        while(true)
        {
            SelectNum();
            int ch = keyboard.nextInt();
            keyboard.nextLine();

            if(ch == 1)
            {
                manager.DataStore();
            }
            else if(ch == 2)
            {
                manager.DataSearch();
            }
            else if(ch == 3)
            {
                manager.DataDelete();
            }
            else
            {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}