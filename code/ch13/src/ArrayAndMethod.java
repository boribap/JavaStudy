public class ArrayAndMethod
{
    public static int[] addAllArray(int[] arr, int addval)
    {
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = arr[i] + addval;
        }
        return arr;
    }

    public static void main(String [] args)
    {
        int[] array = {1,2,3,4,5};
        int[] ref;

        ref = addAllArray(array,6);

        if(array == ref)
        {
            System.out.println("동일 배열 참조 ");
        }else {
            System.out.println("다른 배열 참조");
        }

        for (int i = 0; i < ref.length; i++)
        {
            System.out.println(ref[i]);
        }
    }
}
