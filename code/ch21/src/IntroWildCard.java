class Fruit
{
    public void showYou()
    {
        System.out.println("난 과일 입니다.");
    }
}

class WApple extends Fruit
{
    public void showYou()
    {
        super.showYou();
        System.out.println("난 붉은 사과입니다. ");
    }
}

class WFruitBox<T>
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

public class IntroWildCard
{
    public static void openAndShowFruitBox(WFruitBox<? extends Fruit> box)
    {
        Fruit fruit = box.pullOut();
        fruit.showYou();
    }

    public static void main(String[] args) {
        WFruitBox<Fruit> box1 = new WFruitBox<>();
        box1.store(new Fruit());

        WFruitBox<WApple> box2 = new WFruitBox<>();
        box2.store(new WApple());

        openAndShowFruitBox(box1);
        openAndShowFruitBox(box2);
    }
}
