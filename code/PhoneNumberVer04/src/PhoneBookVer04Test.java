import java.util.Scanner;

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

    // 1 - 일반 , 2 - 대학, 3 - 회사
    public void DataStore()
    {
        System.out.println("데이터 입력을 시작합니다..");
        System.out.println("1. 일반, 2. 대학, 3. 회사");
        System.out.print("선택 >> ");
        int ch = PhoneBookVer04Test.keyboard.nextInt();
        PhoneBookVer04Test.keyboard.nextLine();

        System.out.print("이름 : ");
        String rName = PhoneBookVer04Test.keyboard.nextLine();
        System.out.print("전화번호 : ");
        String rPhoneNumber = PhoneBookVer04Test.keyboard.nextLine();

        if (ch == 1){
            phoneArr[cnt] = new PhoneInfo(rName, rPhoneNumber);
            cnt++;
        }else if (ch == 2){
            System.out.print("전공 : ");
            String rMajor = PhoneBookVer04Test.keyboard.nextLine();
            System.out.print("학년 : ");
            String rYear = PhoneBookVer04Test.keyboard.nextLine();

            phoneArr[cnt] = new PhoneUnivInfo(rName,rPhoneNumber,rMajor,rYear);
            cnt++;
        }else {
            System.out.print("회사 : ");
            String rCompany = PhoneBookVer04Test.keyboard.nextLine();

            phoneArr[cnt] = new PhoneCompanyInfo(rName, rPhoneNumber, rCompany);
            cnt++;
        }

        System.out.println("데이터 입력이 완료되었습니다. \n");
    }

    public void DataSearch()
    {
        System.out.println("데이터 검색을 시작합니다..");
        System.out.println("이름 : ");
        String SearchName = PhoneBookVer04Test.keyboard.nextLine();
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
        String deleteName = PhoneBookVer04Test.keyboard.nextLine();
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


public class PhoneBookVer04Test
{
    static Scanner keyboard = new Scanner(System.in);

    public static void SelectNum()
    {
        System.out.println("선택하세요...");
        System.out.println("1. 데이터 입력 ");
        System.out.println("2. 데이터 검색 ");
        System.out.println("3. 데이터 삭제 ");
        System.out.println("4. 프로그램 종료 ");
        System.out.print("선택 : ");
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
                System.out.println("프로그램을 종료합니다...");
                break;
            }
        }
    }
}
