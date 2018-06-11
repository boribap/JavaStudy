class Person
{
    private int perID;
    private int milID;
    private int birthYear;
    private int birthMonth;
    private int birthDay;

    public Person(int perID, int milID, int bYear, int bMonth, int bDay)
    {
        // 생성자의 매개변수 이름이 perID, milID 이기 때문에 생성자 내에서는 인스턴스 변수 perID, milID에 이름만 가지고 접근 불가
        // this는 인스턴스 자신을 의미하는 키워드. 이를 통해 접근하는 것은 인스턴스 변수와 인스턴스 메소드
        this.perID = perID;
        this.milID = milID;

        birthYear = bYear;
        birthMonth = bMonth;
        birthDay = bDay;
    }

    public Person(int pID, int bYear, int bMonth, int bDay)
    {
        // this를 이용한 생성자 호출
        this(pID, 0, bYear, bMonth, bDay);
    }

    public void showInfo()
    {

    }
}

class CstOverloading
{
    public static void main(String[] args)
    {
        Person man = new Person(1,3,4,5,6);
        Person woman = new Person(2,3,5,4);
    }
}

public class this_example { }
