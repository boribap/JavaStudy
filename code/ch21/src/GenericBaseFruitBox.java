class Apple
{
    int weight;
    public Apple(int weight)
    {
        this.weight = weight;
    }
    public void showWeight()
    {
        System.out.println("무게 : " + weight);
    }
}

class GFruitBox<T>
{
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

public class GenericBaseFruitBox
{
    public static void main(String[] args) {
        GFruitBox<Orange> fBox1 = new GFruitBox<>();
        fBox1.store(new Orange(10));
        Orange orange1 = fBox1.pullOut();
        orange1.showSugarContent();

        GFruitBox<Apple> fBox2 = new GFruitBox<>();
        fBox2.store(new Apple(20));
        Apple apple1 = fBox2.pullOut();
        apple1.showWeight();
    }
}
