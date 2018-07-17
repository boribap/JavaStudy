import java.util.HashSet;
import java.util.Iterator;

class SimpleNum
{
    int num;
    public SimpleNum(int n)
    {
        num = n;
    }

    @Override
    public String toString() {
        // 기본 자료형 데이터를 String 인스턴스로 변환해 준다.
        return String.valueOf(num);
    }
}
public class HashSetEqualityOne
{
    public static void main(String[] args) {
        HashSet<SimpleNum> hset = new HashSet<>();
        hset.add(new SimpleNum(10));
        hset.add(new SimpleNum(20));
        hset.add(new SimpleNum(20));

        System.out.println("저장된 데이터 수 : " + hset.size());

        Iterator<SimpleNum> itr = hset.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
