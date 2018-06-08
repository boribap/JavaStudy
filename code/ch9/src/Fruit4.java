class FruitSellerConstruct {
    int numOfApple;
    int myMoney;
    final int  APPLE_PRICE;

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

public class Fruit4
{
    public static void main(String args[])
    {
        FruitSellerConstruct seller1 = new FruitSellerConstruct(0,30,1500);
        FruitBuyerConstruct buyer1 = new FruitBuyerConstruct(10000);

        // 돈 500원 내고 20개 가져가는것
        seller1.myMoney += 500;
        buyer1.myMoney -= 500;

        //여기서 numOfApple 이 private이라면 구매자가 과일을 얻을 수 있는 방법은 오직 buyApple(seller1, 4500); 방법 뿐이다.
        seller1.numOfApple -=20;
        buyer1.numOfApple +=20;

        System.out.println("과일 판매자1의 현재 상황");
        seller1.showSaleResult();

        System.out.println("과일 구매자1의 현재 상황");
        buyer1.showBuyResult();
    }
}

