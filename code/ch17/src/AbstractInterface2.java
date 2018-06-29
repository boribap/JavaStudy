interface PersonalNumberStorage_
{
    // public abstract가 생략되어 있는 것
    void addPersonalInfo(String name, String perNum);
    String searchName(String perNum);
}

class PersonalNumInfo_
{
    String name;
    String number;

    PersonalNumInfo_(String name, String number){
        this.name = name;
        this.number = number;
    }

    String getName(){return name;}
    String getNumber(){return number;}
}

// 인터페이스는 상속이 아니라 구현이라고 한다.
class PersonalNumberStorageImpl_ implements PersonalNumberStorage_{
    PersonalNumInfo[] perArr;
    int numOfPerInfo;

    public PersonalNumberStorageImpl_(int sz)
    {
        perArr = new PersonalNumInfo[sz];
        numOfPerInfo=0;
    }

    @Override
    public void addPersonalInfo(String name, String perNum) {
        perArr[numOfPerInfo] = new PersonalNumInfo(name, perNum);
        numOfPerInfo++;
    }

    @Override
    public String searchName(String perNum) {
        for (int i = 0; i < numOfPerInfo; i ++){
            if(perNum.compareTo(perArr[i].getNumber()) == 0){
                return perArr[i].getNumber();
            }
        }
        return null;
    }
}

public class AbstractInterface2
{
    public static void main(String[] args) {
        // PersonalNumberStorage_ 는 인터페이스이다. 하지만 참조변수의 선언이 가능 & 선언된 참조변수는 인터페이스 PersonalNumberStorage_ 를 구현하는 모든 클래스의 인스턴스를 참조할 수 있다.
        PersonalNumberStorage_ storage = new PersonalNumberStorageImpl_(100);
        storage.addPersonalInfo("김보원", "123456");
        storage.addPersonalInfo("김성원", "123457");

        storage.searchName("123456");
        storage.searchName("123457");
    }
}
