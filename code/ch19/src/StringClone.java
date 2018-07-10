class Person implements Cloneable
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void changeName(String name)
    {
        this.name = name;
    }

    public void showPersonInfo()
    {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println(" ");
    }

    public Object clone() throws CloneNotSupportedException
    {
        Person copy = (Person)super.clone();
        return copy;
    }
}
public class StringClone
{
    public static void main(String[] args) {
        try {
            Person person1 = new Person("김보원", 23);

            Person person2 = (Person)person1.clone();
            person2.changeName("김성원");

            Person person3 = (Person)person2.clone();
            person3.changeName("김동형");

            person1.showPersonInfo();
            person2.showPersonInfo();
            person3.showPersonInfo();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}
