import java.util.Iterator;
import java.util.LinkedList;

public class PrimitiveCollection
{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(30); // auto boxing
        list.add(40); // auto boxing
        list.add(50); // auto boxing

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext())
        {
            int num = iterator.next(); // auto unboxing
            System.out.println(num);
        }
    }
}
