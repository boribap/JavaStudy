class Orange
{
    int sugarContent;
    public Orange(int sugar)
    {
        sugarContent = sugar;
    }
    public void showSugarContent()
    {
        System.out.println("당도 : " + sugarContent);
    }
}

/**
 * 이렇게 OrangeBox가 아닌 FruitBox로 클래스를 정의하게 되면
 * 실행과정에서 오류가 난다. 실행과정에서 나는 오류는 고치기 힘들기 때문에
 *
 * 실행과정에서 발견되는 오류를 컴파일 과정에서 발견되도록 코드를 작성하는 것은 매우 의미있는 일이다.
 *
 * 그러나 OrangeBox를 정의하는 방법을 택할시 추가되는 과일마다 Box를 만들어주어야한다.
 * 이러한 단점을 제거하고자 정의된 문법적 요소가 '제네릭'이다.
 *
 */
class FruitBox
{
    Object item;
    public void store(Object item)
    {
        this.item = item;
    }
    public Object pullOut()
    {
        return item;
    }
}

public class ObjectBaseFruitBox
{
    public static void main(String[] args) {
        FruitBox fBox1 = new FruitBox();
        fBox1.store(new Orange(10));
        Orange orange1 = (Orange)fBox1.pullOut();
        orange1.showSugarContent();

        FruitBox fBox2 = new FruitBox();
        fBox2.store("오렌지");
        Orange orange2 = (Orange) fBox2.pullOut();
        orange2.showSugarContent();
    }
}
