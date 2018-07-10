class Business implements Cloneable
{
    private String company;
    private String work;

    public Business(String company, String work)
    {
        this.company = company;
        this.work = work;
    }

    public void showBusinessInfo()
    {
        System.out.println("회사 : " + company);
        System.out.println("업무 : " + work);
    }

    public void changeWork(String work)
    {
        this.work = work;
    }

    public Object clone() throws CloneNotSupportedException
    {
        Business copy = (Business)super.clone();
        return copy;
    }
}

class PersonalInfo implements Cloneable
{
    private String name;
    private int age;
    private Business bness;

    public PersonalInfo(String name, int age, String company, String work)
    {
        this.name = name;
        this.age = age;
        bness = new Business(company,work);
    }

    public void showPersonalInfo()
    {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        bness.showBusinessInfo();
        System.out.println(" ");
    }

    public void changeWork(String work)
    {
        bness.changeWork(work);
    }

    public Object clone() throws CloneNotSupportedException
    {
        PersonalInfo copy = (PersonalInfo)super.clone();
        copy.bness = (Business)bness.clone();
        return copy;
    }
}

public class ch19_example_2
{
    public static void main(String[] args) {
        try {
            PersonalInfo pInfo1 = new PersonalInfo("김보원", 23, "naver", "developer");

            PersonalInfo pInfo2 = (PersonalInfo) pInfo1.clone();
            pInfo2.changeWork("decoding");

            pInfo1.showPersonalInfo();
            pInfo2.showPersonalInfo();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}
