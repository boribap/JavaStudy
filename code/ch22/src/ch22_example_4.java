import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class IntroComparator implements Comparator<String >
{
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length())
            return 1;
        else if (o1.length() < o2.length())
            return -1;
        else
            return 0;
    }
}

public class ch22_example_4
{
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>(new IntroComparator());
        tree.add("o");
        tree.add("dffd");
        tree.add("qw");

        Iterator<String> itr = tree.descendingIterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
