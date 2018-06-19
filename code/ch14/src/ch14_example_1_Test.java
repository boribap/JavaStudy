class Car
{
    int gasolinGauge;

    public Car(int oil)
    {
        gasolinGauge = oil;
    }
}

class HybridCar extends Car
{
    int electricGauge;

    public HybridCar(int oil, int electic)
    {
        super(oil);
        electricGauge = electic;
    }
}

class HybridWaterCar extends HybridCar
{
    int waterGauge;

    public HybridWaterCar(int oil, int electic, int water)
    {
        super(oil, electic);
        waterGauge = water;
    }

    public void showCurrentGauge()
    {
        System.out.println("잔여 가솔린 : " + gasolinGauge);
        System.out.println("잔여 전기량 : " + electricGauge);
        System.out.println("잔여 워터량 : " + waterGauge);
    }
}

public class ch14_example_1_Test
{
    public static void main(String [] args)
    {
        HybridWaterCar car1 = new HybridWaterCar(5,3,6);
        System.out.println("----------car1----------");
        car1.showCurrentGauge();

        HybridWaterCar car2 = new HybridWaterCar(1,6,2);
        System.out.println("----------car2----------");
        car2.showCurrentGauge();
    }
}
