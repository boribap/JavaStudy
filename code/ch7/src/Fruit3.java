class FruitSellerConstruct {
    int numOfApple;
    int myMoney;
    int APPLE_PRICE;

    public FruitSellerConstruct(int money, int appleNum, int price)
    {
        myMoney = money;
        numOfApple = appleNum;
        APPLE_PRICE = price;
    }

    public int saleApple(int money)
    {
        int num = money / APPLE_PRICE;
        numOfApple -= num;
        myMoney+=money;

        return num;
    }

    public void showSaleResult()
    {
        System.out.println("남은사과:" + numOfApple);
        System.out.println("판매수익:" + myMoney);
    }
}

class FruitBuyerConstruct
{
    int myMoney;
    int numOfApple;

    public FruitBuyerConstruct(int money)
    {
        myMoney = money;
        numOfApple = 0;
    }

    public void buyApple(FruitSellerConstruct seller ,int money)
    {
        numOfApple+=seller.saleApple(money);
        myMoney-=money;
    }

    public void showBuyResult()
    {
        System.out.println("사과개수:" + numOfApple);
        System.out.println("남은금액:" + myMoney);
    }
}

public class Fruit3
{
    public static void main(String args[])
    {
        FruitSellerConstruct seller1 = new FruitSellerConstruct(0,30,1500);
        FruitSellerConstruct seller2 = new FruitSellerConstruct(0,20,1000);

        FruitBuyerConstruct buyer1 = new FruitBuyerConstruct(10000);
        buyer1.buyApple(seller1, 4500);
        buyer1.buyApple(seller2, 2000);

        System.out.println("과일 판매자1의 현재 상황");
        seller1.showSaleResult();
        System.out.println("과일 판매자2의 현재 상황");
        seller2.showSaleResult();

        System.out.println("과일 구매자1의 현재 상황");
        buyer1.showBuyResult();
    }
}
