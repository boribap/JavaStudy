import java.util.ArrayList;

public class IntroArrayList
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        /* 데이터의 삽입 */
        list.add(11);
        list.add(22);

        /* 데이터의 참조 */
        for (int i = 0 ; i < list.size(); i ++)
        {
            System.out.println(list.get(i));
        }

        /* 데이터의 삭제 */
        list.remove(0);
    }
}
