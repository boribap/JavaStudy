import java.util.Scanner;

public class ch13_example_1_Test
{
    /**
     * 배열의 최소값 반환
     * @param arr 최소값을 반환할 대상의 배열
     * @return 최소값
     */
    public static int minValue(int[] arr)
    {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
        {

            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 배열의 최댓값 반환
     *
     * @param arr 최대값 반환할 대상의 배열
     * @return 최댓값
     */
    public static int maxValue(int[] arr)
    {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String [] args)
    {
        Scanner keyBoard = new Scanner(System.in);

        int[] array = new int[7];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = keyBoard.nextInt();
        }

        int resultMin = minValue(array);
        int resultMax = maxValue(array);

        System.out.println(resultMin);
        System.out.println(resultMax);
    }
}
