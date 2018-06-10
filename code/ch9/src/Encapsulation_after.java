// 콧물 처치용 캠슐
class SinivelCap_a
{
    public void take()
    {
        System.out.println("콧물이 다 나았습니다.");
    }
}
// 재채기 처치용 캡슐
class SneezeCap_a
{
    public void take()
    {
        System.out.println("재채기가 다 나았습니다");
    }
}
// 코막힘 처치용 캡슐
class SnuffleCap_a
{
    public void take()
    {
        System.out.println("코가 뻥 뚫립니다");
    }
}
class CONTAC600
{
    SinivelCap_a sin;
    SneezeCap_a sne;
    SnuffleCap_a snu;

    public CONTAC600()
    {
        sin = new SinivelCap_a();
        sne = new SneezeCap_a();
        snu = new SnuffleCap_a();
    }
    public void take()
    {
        sin.take();
        sne.take();
        snu.take();
    }
}
class ColdPatient_a
{
    public void takeCONTAC600(CONTAC600 cap)
    {
        cap.take();
    }
}
public class Encapsulation_after
{
    public static void main(String[] args)
    {
        ColdPatient_a sufferer = new ColdPatient_a();
        sufferer.takeCONTAC600(new CONTAC600());
    }
}
