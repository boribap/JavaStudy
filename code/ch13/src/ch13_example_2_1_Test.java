public class ch13_example_2_1_Test
{
    public static void addTwoDArr(int[][] arr, int addValue)
    {
        // 2차원 배열의 인덱스 사용 조심하기
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] += addValue;
            }
        }
    }

    public static void main(String [] args)
    {
        int[][] array = {
                {1,2,3,4},
                {1,2},
                {7}
        };

        int addVal = 1;

        addTwoDArr(array,addVal);

        for (int i = 0 ; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
