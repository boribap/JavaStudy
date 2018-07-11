import java.io.IOException;

public class RunningProcess
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        Process proc = Runtime.getRuntime().exec("java FirstAWTExitEvent");
        proc.waitFor();

        if (proc.exitValue() == 0)
        {
            System.out.println("정상종료");
        }
        else
        {
            System.out.println("비정상종료");
        }
    }
}
