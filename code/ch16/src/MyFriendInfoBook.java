import java.util.Scanner;

// Friend클래스는 상위 클래스로써의 역할만 담당하도록 정의했다. --> Friend의 인스턴스 생성은 원하는 것이 아님
// 다만, 인스턴스의 생성을 위한 하위 클래스들의 상위 클래스로서만 역할.
class Friend{
    String name;
    String phoneNum;
    String addr;

    public Friend(String name, String phoneNum, String addr){
        this.name = name;
        this.phoneNum = phoneNum;
        this.addr = addr;
    }

    public void ShowData(){
        System.out.println("이름 : "+ name);
        System.out.println("번호 : " + phoneNum);
        System.out.println("주소 : " + addr);
    }

    // 매우 주관적인 최소한의 정보를 의미한다. 그래서 상위 클래스에서는 정의만하고 빈 상태로 내버려 둔다.
    // 여기에 이렇게 빈 것이라도 정의해두는 의미 알기
    public void ShowBasicInfo(){ }
}

class HighFriend extends Friend{
    String work;

    public HighFriend(String name, String phoneNum, String addr, String work){
        super(name, phoneNum, addr);
        this.work = work;
    }

    public void ShowData(){
        super.ShowData();
        System.out.println("직업 : " + work);
    }

    public void ShowBasicInfo(){
        System.out.println("이름 : " + name);
        System.out.println("전화 : " + phoneNum);
    }
}

class UnivFriend extends Friend{
    String major;

    public UnivFriend(String name, String phoneNum, String addr, String major){
        super(name, phoneNum, addr);
        this.major = major;
    }

    public void ShowData(){
        super.ShowData();
        System.out.println("전공 : " + major);
    }

    public void ShowBasicInfo(){
        System.out.println("이름 : " + name);
        System.out.println("전화 : " + phoneNum);
        System.out.println("전공 : " + major);
    }
}

// 프로그램의 목적, 제공하는 기능에 맞게 프로그램의 흐름을 컨트롤해주는 클래스
// FriendInfoHandler 클래스는 상속을 통해 연관된 HighFriend, UnivFriend, 클래스에 대해 동일한 방식으로 배열에 저장 및 메소드 호출을 할 수 있습니다.
class FriendInfoHandler
{
    // 만약 high,univ가 한개의 클래스를 상속받고 있지 않았다면 한개의 배열에 같이 넣을 수 없으므로 클래스별 인스턴스 저장을 위한 배열을 선언해야함
    private Friend[] myFriends;
    private int numOfFriends;

    // 생성자 (초기화 작업)
    public FriendInfoHandler(int num){
        myFriends = new Friend[num];
        numOfFriends = 0;
    }

    //myFriends 라는 배열에 접근하기 위한 메소드
    // 외부에서의 호출을 막고 클래스 내부에서만 호출가능
    private void addFriendInfo(Friend fren){
        myFriends[numOfFriends++] = fren;
    }

    // 새로운 데이터의 저장
    // 1 - 고등학교 친구 / 2 - 대학교 친구
    public void addFriend(int choice){
        String name, phoneNum, addr, work, major;

        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        name = sc.nextLine();
        System.out.print("번호 : ");
        phoneNum = sc.nextLine();
        System.out.println("주소 : ");
        addr = sc.nextLine();

        if (choice == 1){
            System.out.print("직업 : ");
            work = sc.nextLine();
            addFriendInfo(new HighFriend(name, phoneNum, addr, work));
        }
        else {
            System.out.println("전공 : ");
            major = sc.nextLine();
            addFriendInfo(new UnivFriend(name, phoneNum, addr, major));
        }

        System.out.println("입력완료 \n");
    }

    // 전체 인스턴스 대상의 데이터 출력
    public void showAllData(){
        for (int i = 0; i < numOfFriends; i++){
            myFriends[i].ShowData();
            System.out.println(" ");
        }
    }

    // 전체 인스턴스 대상의 기본 데이터 출력
    public void showAllSimpleData(){
        for (int i = 0; i < numOfFriends; i++){
            myFriends[i].ShowBasicInfo();
            System.out.println(" ");
        }
    }
}

// 데이터 표현 클래스 - FriendInfoHandler
// 기능 컨트롤 클래스 - Friend, HighFriend, UnivFriend
public class MyFriendInfoBook
{
    // 프로그램 실행을 위한 기본적인 인스턴스 생성 --> main에서 해야할일
    // 프로그램 사용자의 입력을 소프트웨어 내부로 전달 --> 사실은 UI를 담당하는 별도의 클래스에서 담당해야하는 일 (AWT, SWING)
    public static void main(String[] args) {
        FriendInfoHandler handler = new FriendInfoHandler(10);

        while (true){
            System.out.println("------------메뉴 선택------------");
            System.out.println("1. 고교 정보 저장 ");
            System.out.println("2. 대학 친구 저장 ");
            System.out.println("3. 전체 정보 출력 ");
            System.out.println("4. 기본 정보 출력 ");
            System.out.println("5. 프로그램 종료 ");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            if (choice == 1 || choice == 2){
                handler.addFriend(choice);
            }
            else if(choice == 3){
                handler.showAllData();
            }
            else if (choice == 4){
                handler.showAllSimpleData();
            }
            else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
