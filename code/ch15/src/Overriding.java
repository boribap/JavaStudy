class Speaker
{
    private int volumeRate;

    public void showCurrentState()
    {
        System.out.println("볼륨 크기 : " + volumeRate);
    }
    public void setVolume(int vol)
    {
        volumeRate = vol;
    }
}

class BaseEnSpeaker extends Speaker
{
    private int baseRate;

    // 메소드 오버라이딩
    public void showCurrentState()
    {
        super.showCurrentState();
        System.out.println("베이스 크기 : " + baseRate);
    }
    public void setBaseRate(int base)
    {
        baseRate = base;
    }
}

public class Overriding
{
    public static void main(String [] args)
    {
        BaseEnSpeaker bs = new BaseEnSpeaker();
        bs.setVolume(10);
        bs.setBaseRate(30);
        bs.showCurrentState();
    }
}
