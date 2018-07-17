import java.util.HashSet;
import java.util.Iterator;

class SimpleNumber
{
    int num;
    public SimpleNumber(int n)
    {
        num = n;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }

    @Override
    public int hashCode() {
        return num%3;
    }

    @Override
    public boolean equals(Object obj) {
        SimpleNumber comp = (SimpleNumber)obj;
        if (comp.num == num)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
public class HashSetEqualityTwo
{
    public static void main(String[] args) {
        HashSet<SimpleNumber> hset = new HashSet<>();
        hset.add(new SimpleNumber(10));
        hset.add(new SimpleNumber(20));
        hset.add(new SimpleNumber(20));

        System.out.println("저장된 데이터 수 : " + hset.size());

        Iterator<SimpleNumber> itr = hset.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
