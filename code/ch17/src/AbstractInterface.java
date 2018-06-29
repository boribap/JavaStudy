abstract class PersonalNumberStorage
{
    public abstract void addPersonalInfo(String name, String perNum);
    public abstract String searchName(String perNum);
}

class PersonalNumInfo
{
    String name;
    String number;

    PersonalNumInfo(String name, String number){
        this.name = name;
        this.number = number;
    }

    String getName(){return name;}
    String getNumber(){return number;}
}

class PersonalNumberStorageImpl extends PersonalNumberStorage{
    PersonalNumInfo[] perArr;
    int numOfPerInfo;

    public PersonalNumberStorageImpl(int sz)
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

public class AbstractInterface
{
    public static void main(String[] args) {
        PersonalNumberStorage storage = new PersonalNumberStorageImpl(100);
        storage.addPersonalInfo("김보원", "123456");
        storage.addPersonalInfo("김성원", "123457");

        storage.searchName("123456");
        storage.searchName("123457");
    }
}