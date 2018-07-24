class MessageSendingThread extends Thread
{
    String message;

    public MessageSendingThread(String msg)
    {
        message = msg;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i ++)
        {
            System.out.println(message + "("+ getPriority() +")");
        }
    }
}
public class PriorityTest
{
    public static void main(String[] args) {
        // 우선순위가 동일해서 CPU의 할당시간을 나눠가면서 쓰레드가 실행됨
        MessageSendingThread m1 = new MessageSendingThread("First");
        MessageSendingThread m2 = new MessageSendingThread("Second");
        MessageSendingThread m3 = new MessageSendingThread("Third");

        m1.start();
        m2.start();
        m3.start();
    }
}
