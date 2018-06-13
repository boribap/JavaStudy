class PhoneInfo
{
    String name;
    String phoneNumber;
    String birthday;

    public PhoneInfo(String name, String phoneNumber, String birthday){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }
    public PhoneInfo(String name_nb, String phoneNumber_nb){
        this(name_nb,phoneNumber_nb,"");
    }

    public void showInfo()
    {
        System.out.println("전화번호 정보");
        System.out.println("이름 : " + name );
        System.out.println("전화번호 : " + phoneNumber);
        if (birthday != null)
        {
            System.out.println("생년월일 : " + birthday);
        }
    }
}
public class PhoneInfoTest
{
    public static void main(String[] args)
    {
        PhoneInfo phone1 = new PhoneInfo("김보원", "010-4121-5801", "1996-03-12");
        PhoneInfo phone2 = new PhoneInfo("김동형", "010-2870-5801");

        phone1.showInfo();
        phone2.showInfo();
    }

}
