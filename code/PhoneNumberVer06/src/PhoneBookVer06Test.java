/**
 * 호출한 메소드에 throws절이 있다면, 예외의 처리를 위한try~catch문을 삽입하거나, 해당 예외를 처리하지 않고 재차 던지겠음을 표시하기 위해 throws절을 삽입해야한다.
 *
 * 예외 클래스 는 Exception 클래스를 상속해서 정의하며, 키워드 throws를 이용해서 예외를 발생시킨다.
 *
 */

/**
 * 추가할 예외상황
 *
 * 1) 초기 메뉴 선택에서 1,2,3,4 이외의 값을 입력하는 예외상황
 * 2) 데이터 입력의 과정에서 (inputData 메소드 내에서) 1,2,3 이외의 값을 입력하는 예외상황
 *
 * 두개의 예외상황은 모두 동일 유형이니, MenuChoiceException 이라는 이름의 예외 클래스를 하나 정의해서 위 두개에 활용할 것
 * 두개의 예외상황 모두 예외가 발생하면 초기 메뉴 선택으로 이동하도록 한다.
 *
 */

import java.util.Scanner;

interface FIRST_MENU
{
    int INPUT = 1, SEARCH = 2, DELETE = 3, EXIT = 4;
}

interface SECOND_MENU
{
    int GENERAL = 1, UNIV = 2, COMPANY = 3;
}

/**
 * 예외 클래스 작성
 */
class MenuChoiceException extends Exception
{
    int num;

    public MenuChoiceException(int num)
    {
        super("잘못된 선택이 이루어졌습니다. ");
        this.num = num;
    }

    public void ShowWrongMenu()
    {
        System.out.println(num + "에 해당하는 선택은 존재하지 않습니다. ");
    }
}

class PhoneInfo{
    String name;
    String phoneNumber;

    public PhoneInfo(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void ShowData(){
        System.out.println("이름 : "  + name);
        System.out.println("전화전호 : " + phoneNumber);
    }
}

class PhoneUnivInfo  extends PhoneInfo{
    String major;
    String year;

    public PhoneUnivInfo(String name, String phoneNumber, String major, String year){
        super(name,phoneNumber);
        this.major = major;
        this.year = year;
    }

    public void ShowData(){
        super.ShowData();
        System.out.println("전공 : " + major);
        System.out.println("학년 : " + year);
    }
}

class PhoneCompanyInfo extends PhoneInfo{
    String company;

    public PhoneCompanyInfo(String name, String phonNumber, String company){
        super(name,phonNumber);
        this.company = company;
    }

    public void ShowData(){
        super.ShowData();
        System.out.println("회사 : " + company);
    }
}

class PhoneBookManager
{
    final int MAX_SIZE = 100;
    //배열의 자료형은 class도 가능하다는것...!
    PhoneInfo [] phoneArr = new PhoneInfo[MAX_SIZE];
    //cnt 이용해서 숫자 세기 (삽입 +1 삭제 -1)
    int cnt = 0;

    public PhoneBookManager() { }

    // manager 클래스는 인스턴스 1개만 있으면 됨
    // 그래서 인스턴스를 1개만 생성가능하도록 만든것
    private static PhoneBookManager OnlyManager = null;

    public static PhoneBookManager getOnlyManager()
    {
        if (OnlyManager == null)
        {
            OnlyManager = new PhoneBookManager();
        }
        return OnlyManager;
    }

    // 1 - 일반 , 2 - 대학, 3 - 회사
    public void DataStore() throws MenuChoiceException
    {
        System.out.println("데이터 입력을 시작합니다..");
        System.out.println("1. 일반, 2. 대학, 3. 회사");
        System.out.print("선택 >> ");
        int ch = MenuViewer.keyboard.nextInt();
        MenuViewer.keyboard.nextLine();

        /**
         * 2번 예외 상황
         */
        if (ch < SECOND_MENU.GENERAL || ch > SECOND_MENU.COMPANY)
        {
            throw new MenuChoiceException(ch);
        }

        System.out.print("이름 : ");
        String rName = MenuViewer.keyboard.nextLine();
        System.out.print("전화번호 : ");
        String rPhoneNumber = MenuViewer.keyboard.nextLine();

        if (ch == SECOND_MENU.GENERAL){
            phoneArr[cnt] = new PhoneInfo(rName, rPhoneNumber);
            cnt++;
        }else if (ch == SECOND_MENU.UNIV){
            System.out.print("전공 : ");
            String rMajor = MenuViewer.keyboard.nextLine();
            System.out.print("학년 : ");
            String rYear = MenuViewer.keyboard.nextLine();

            phoneArr[cnt] = new PhoneUnivInfo(rName,rPhoneNumber,rMajor,rYear);
            cnt++;
        }else if (ch == SECOND_MENU.COMPANY){
            System.out.print("회사 : ");
            String rCompany = MenuViewer.keyboard.nextLine();

            phoneArr[cnt] = new PhoneCompanyInfo(rName, rPhoneNumber, rCompany);
            cnt++;
        }

        System.out.println("데이터 입력이 완료되었습니다. \n");
    }

    public void DataSearch()
    {
        System.out.println("데이터 검색을 시작합니다..");
        System.out.println("이름 : ");
        String SearchName = MenuViewer.keyboard.nextLine();
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
        else {
            System.out.println("데이터 검색이 완료되었습니다. \n");
        }
    }

    public void DataDelete()
    {
        System.out.println("데이터를 삭제를 시작합니다..");

        System.out.println("이름 : ");
        String deleteName = MenuViewer.keyboard.nextLine();
        int flag = 0;

        for (int i = 0; i < cnt; i++)
        {
            if(phoneArr[i].name.equals(deleteName))
            {
                phoneArr[i] = phoneArr[i+1];
                cnt = cnt - 1;
                flag = 1;
            }
        }

        if(flag == 0)
        {
            System.out.println("해당 데이터가 존재하지 않습니다.");
        }
        else{
            System.out.println("데이터 삭제가 완료되었습니다. \n");
        }
    }
}

class MenuViewer
{
    public static Scanner keyboard = new Scanner(System.in);

    public static void SelectNum()
    {
        System.out.println("선택하세요....");
        System.out.println("1. 데이터 입력 ");
        System.out.println("2. 데이터 검색 ");
        System.out.println("3. 데이터 삭제 ");
        System.out.println("4. 프로그램 종료 ");
        System.out.print("선택 : ");
    }
}

public class PhoneBookVer06Test
{
    public static void main(String[] args)
    {
        PhoneBookManager manager = PhoneBookManager.getOnlyManager();
        int ch;

        while (true){
            try
            {
                MenuViewer.SelectNum();
                ch = MenuViewer.keyboard.nextInt();
                MenuViewer.keyboard.nextLine();

                /**
                 * 1번 예외상황
                 */
                if (ch < FIRST_MENU.INPUT || ch > FIRST_MENU.EXIT)
                {
                    throw new MenuChoiceException(ch);
                }

                if(ch == FIRST_MENU.INPUT)
                {
                    manager.DataStore();
                }
                else if(ch == FIRST_MENU.SEARCH)
                {
                    manager.DataSearch();
                }
                else if(ch == FIRST_MENU.DELETE)
                {
                    manager.DataDelete();
                }
                else if(ch == FIRST_MENU.EXIT)
                {
                    System.out.println("프로그램을 종료합니다...");
                    break;
                }
            }
            catch (MenuChoiceException e)
            {
                e.ShowWrongMenu();
                System.out.println("메뉴 선택을 처음부터 다시 진행합니다. \n");
            }
        }
    }
}
