class Box<T>
{
    public Box<T> nextBox;
    T item;

    public void store(T item)
    {
        this.item = item;
    }
    public T pullOut()
    {
        return item;
    }
}

public class SoSimpleLinkedListImpl
{
    public static void main(String[] args) {
        Box<String > boxHead = new Box<>();
        boxHead.store("First");

        boxHead.nextBox = new Box<>();
        boxHead.nextBox.store("Second");

        boxHead.nextBox.nextBox = new Box<>();
        boxHead.nextBox.nextBox.store("Third");
    }
}
