// 콧물 처치용 캠슐
class SinivelCap
{
    public void take()
    {
        System.out.println("콧물이 다 나았습니다.");
    }
}
// 재채기 처치용 캡슐
class SneezeCap
{
    public void take()
    {
        System.out.println("재채기가 다 나았습니다");
    }
}
// 코막힘 처치용 캡슐
class SnuffleCap
{
    public void take()
    {
        System.out.println("코가 뻥 뚫립니다");
    }
}
class ColdPatient
{
    public void takeSinivelCap(SinivelCap cap)
    {
        cap.take();
    }
    public void takeSneezeCap(SneezeCap cap)
    {
        cap.take();
    }
    public void takeSnuffleCap(SnuffleCap cap)
    {
        cap.take();
    }
}
public class Encapculation_before
{
    public static void main(String[] args)
    {
        ColdPatient sufferer = new ColdPatient();
        // 인스턴스가 생성되면 생성된 인스턴스의 주소값이 반환됨
        // 그래서 주소값을 인자로 전달하여, 참조변수로 선언되어 있는 매개변수를 초기화한다.
        sufferer.takeSinivelCap(new SinivelCap());
        sufferer.takeSneezeCap(new SneezeCap());
        sufferer.takeSnuffleCap(new SnuffleCap());
    }
}