class Man
{
    private String name;
    public Man(String name)
    {
        // 인스턴스 변수의 초기화는 인스턴스 변수가 선언된 클래스의 생성자를 통해서 진행하는 것이 가장 좋은 모델
        this.name = name;
    }
    public void tellYourName()
    {
        System.out.println("My name is " + name);
    }
}

class BusinessMan extends Man
{
    private String company;
    private String position;
    public BusinessMan(String name, String company, String position)
    {
        // 상위 클래스의 생성자 호출문
        super(name);
        this.company = company;
        this.position = position;
    }
    public void tellYourInfo()
    {
        System.out.println("My company is " + company);
        System.out.println("My position is " + position);
        // Man 클래스를 상속 했기 때문에 접근 가능
        tellYourName();
    }
}

public class BasicInheritence
{
    public static void main(String [] args)
    {
        BusinessMan man1 = new BusinessMan("Mr. HOng", "LG" , "staff");
        BusinessMan man2 = new BusinessMan("Ms. Kim", "Samsung", "Junier");

        System.out.println("man1 ----------------");
        man1.tellYourName();
        man1.tellYourInfo();
        System.out.println("man2 ----------------");
        man2.tellYourInfo();
    }
}
