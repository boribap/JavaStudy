public class ch13_example_2_2_Test
{
    public static int[][] NextLine(int [][] arr)
    {
        int[][] arrTemp = new int[arr.length][];
        for (int i = 0; i < arr.length; i++)
        {
            arrTemp[i] = new int[arr[i].length];
        }

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if(i == (arr.length - 1)){
                    arrTemp[0][j] = arr[i][j];
                }else {
                    arrTemp[i+1][j] = arr[i][j];
                }
            }
        }
        return arrTemp;
    }

    // 신박한 방법 개지렸다.....
    public static void NextLineAdvanced(int[][] arr)
    {
        int [] lastRow = arr[arr.length-1];

        for (int i = arr.length -1; i > 0; i --)
        {
            arr[i] = arr[i-1];
        }

        arr[0] = lastRow;
    }

    public static void main(String [] args)
    {
        int [][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int [][] arrayResult;

        arrayResult = NextLine(array);

        for (int i = 0; i < arrayResult.length; i ++)
        {
            for (int j = 0; j < arrayResult[i].length; j++)
            {
                System.out.print(arrayResult[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
