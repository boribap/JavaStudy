class ShowTread extends Thread
{
    String threadName;

    public ShowTread(String name){
        threadName = name;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 100; i ++)
        {
            System.out.println(threadName);
            try {
                sleep(100);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadUnderstand
{
    public static void main(String[] args) {
        // 두개의 인스턴스 생성 --> 두개의 쓰레드 생성
        ShowTread thread1 = new ShowTread("멋진 쓰레드");
        ShowTread thread2 = new ShowTread("예쁜 쓰레드");
        thread1.start();
        thread2.start();
    }
}
