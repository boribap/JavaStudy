import java.util.Scanner;

public class KeyBoardScanning
{
    public static void main(String [] args)
    {
        // 키보드로부터 읽어오는 것
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;

        System.out.println(sum);
    }
}
