interface TV
{
    void onTV();
}

class TVImpl
{
    public void onTV()
    {
        System.out.println("영상 출력 중 ");
    }
}

// Computer 를 클래스가 아닌 인터페이스로 정의
// Computer클래스가 할일은 ComputerImpl클래스가 대신하도록 한다.
interface Computer
{
    void dataReceive();
}

class ComputerImpl
{
    public void dataReceive()
    {
        System.out.println("영상 데이터 수신 중 ");
    }
}

class IPTV implements TV, Computer
{
    // ComputerImpl의 인스턴스를 생성하여 인터페이스 Computer의 메소드를 호출할 수 있게 한다 (인터페이스는 인스턴스 생성이 안되므로)
    ComputerImpl comp = new ComputerImpl();
    TVImpl tv = new TVImpl();

    public void onTV()
    {
        tv.onTV();
    }

    public void dataReceive()
    {
        comp.dataReceive();
    }

    public void powerOn()
    {
        onTV();
        dataReceive();
    }
}

public class MultiIInterfaceImpl
{
    public static void main(String[] args) {
        IPTV iptv = new IPTV();
        iptv.powerOn();

        TV tv = iptv;
        Computer comp = iptv;
    }
}
