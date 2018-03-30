/*문제 2*/

/*public class Person {
    private Phone[] phones;
    public Person(){
        phones = new Phone[2];
    }

    //연관 관계에 있는 것에 대한 정의
    public Phone getPhones(int i) {
        if(i == 0 || i == 1){
            return phones[i];
        }
        return null;
    }
}
*/

/*문제 3*/
public class Person {
    //연관관계에 사용되는 속성
    private Phone homePhone;
    private Phone officePhone;


    //연관 관계를 나타냄
    //연관 관계의 화살표가 나가는 클래스에 set~을 한다.
    public void setHomePhone(Phone phone){
        this.homePhone = phone;
    }
    public void  setOfficePhone(Phone phone){
        this.officePhone = phone;
    }
    public Phone getHomePhone() {
        return homePhone;
    }
    public Phone getOfficePhone() {
        return officePhone;
    }
}
