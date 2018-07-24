class Sum
{
    int num;
    public Sum()
    {
        num = 0;
    }
    public void addNum(int n)
    {
        num += n;
    }
    public int getNum()
    {
        return num;
    }
}

class AdderThread extends Sum implements Runnable
{
    int start, end;

    public AdderThread(int s, int e)
    {
        start = s;
        end = e;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++)
        {
            addNum(i);
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        AdderThread thread1 = new AdderThread(1,50);
        AdderThread thread2 = new AdderThread(51,100);

        Thread tr1 = new Thread(thread1);
        Thread tr2 = new Thread(thread2);

        tr1.start();
        tr2.start();

        try {
            tr1.join();
            tr2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("1~100까지의 합 : " + (thread1.getNum() + thread2.getNum()));
    }
}
