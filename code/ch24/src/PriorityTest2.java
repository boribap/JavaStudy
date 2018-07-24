class MessageSendingThrea extends Thread
{
    String message;

    public MessageSendingThrea(String msg, int prio)
    {
        message = msg;
        setPriority(prio);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i ++)
        {
            System.out.println(message + "("+ getPriority() +")");
        }
    }
}
public class PriorityTest2
{
    public static void main(String[] args) {
        // 우선순위가 높은 쓰레드가 종료되어야 그다음 쓰레드가 실행됨
        // 대부분의 시스템에서는 우선순위가 높은 쓰레드에게만 실행의 기회를 부여함
        MessageSendingThrea m1 = new MessageSendingThrea("First",Thread.MAX_PRIORITY);
        MessageSendingThrea m2 = new MessageSendingThrea("Second",Thread.NORM_PRIORITY);
        MessageSendingThrea m3 = new MessageSendingThrea("Third",Thread.MIN_PRIORITY);

        m1.start();
        m2.start();
        m3.start();
    }
}
