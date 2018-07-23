import java.util.Iterator;
import java.util.TreeSet;

/**
 * String 클래스의 Wrapper 클래스
 *
 * 이 클래스의 인스턴스들이 TreeSet<E>에 저장될때, 인스턴스 변수 str이 참조하는 문자열의 길이를 기준으로 정렬
 *
 */
class MyString implements Comparable<MyString>
{
    String str;
    public MyString(String str)
    {
        this.str = str;
    }

    public int getLength()
    {
        return str.length();
    }

    @Override
    public int compareTo(MyString o) {
        if (getLength()>o.getLength())
        {
            return 1;
        }
        else if (getLength() < o.getLength())
        {
            return -1;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return str;
    }
}

public class implementsComparable
{
    public static void main(String[] args) {
        TreeSet<MyString> tree = new TreeSet<>();
        tree.add(new MyString("Orange"));
        tree.add(new MyString("Odf"));
        tree.add(new MyString("O"));
        tree.add(new MyString("Orangewww"));

        Iterator<MyString> itr = tree.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
