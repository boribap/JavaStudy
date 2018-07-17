import java.util.Iterator;
import java.util.LinkedList;

public class IteratorUsage
{
    public static void main(String[] args) {
        LinkedList<String > list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        Iterator<String > itr = list.iterator();

        while (itr.hasNext())
        {
            String curStr = itr.next();
            System.out.println(curStr);
            if (curStr.compareTo("3") == 0)
            {
                itr.remove();
            }
        }
    }
}
