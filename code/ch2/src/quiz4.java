import java.util.Iterator;
import java.util.LinkedList;

public class quiz4 {
    int computeTotalPrice(LinkedList<Fruit> f){
        int total = 0;
        Iterator<Fruit> itr = f.iterator();

        while(itr.hasNext()){
            Fruit curFruit = itr.next();
            total = total + curFruit.calculatePrice();
        }
        return total;
    }
}


//calculatePrice() 매서드는 실제 과일 객체의 종류에 따라 다르게 실행된다 --> 다형성과 연관되어 있음
