class GCFruitBox<T>
{
    T item;

    public GCFruitBox(T item)
    {
        this.item = item;
    }

    public void store(T item)
    {
        this.item = item;
    }
    public T pullOut()
    {
        return item;
    }
}

public class ch21_example_1
{
    public static void main(String[] args) {
        GCFruitBox<Orange> orgBox = new GCFruitBox<>(new Orange(10));
        Orange org = orgBox.pullOut();
        org.showSugarContent();

        GCFruitBox<Apple> apBox = new GCFruitBox<>(new Apple(20));
        Apple ap = apBox.pullOut();
        ap.showWeight();
    }
}
