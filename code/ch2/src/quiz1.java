//스택에서는 자료구조가 변경될 가능성이 크므로 자료구조의 형태와 관련이 있는 top, intArray, Stacksize 클래스를 외부에서 접근하지 못하도록 private키워드을 이용해 은닉시킨다.
//위와 같이 바꾸면 직접 변경하거나, add()를 이용해 연산 불가. 오직 pop,push,peek메서드의 연산으로만 스택 사용가능해진다.
//위 3개의 메서드가 어떤 방식으로 어떤 자료구조를 처리하는지는 private으로 보호되기 때문에 알수 없게됨. --> 이렇게 함으로써 결합이 낮아지게 됨.

//ArrayList내의 메서드를 통해 top없이 스택구현 가능.
import java.util.ArrayList;

public class quiz1 {
    private int stackSize;
    private ArrayList<Integer> items; //자료구조를 배열에서 ArrayList로 변경.

    //생성자
    public quiz1(int stackSize) {
        items = new ArrayList<Integer>(stackSize);
        this.stackSize = stackSize;
    }

    //스택이 비어있는지 검사
    public boolean isEmpty() {
        return items.isEmpty();
    }

    //스택이 꽉 차 있는지 검사
    public boolean isFull() {
        return (items.size() >= this.stackSize);
    }

    //스택에 아이템 추가
    public void push(int item) {
        if (isFull()) {
            System.out.println("Array Stack is full");
        } else {
            items.add(new Integer(item));
            System.out.println("Inserted item : " + item);
        }
    }

    //스택의 top에 있는 아이템 반환
    public int pop() {
        if (isEmpty()) {
            System.out.println("Array Stack is empty");
            return -1;
        } else {
            return items.remove(items.size()-1);
        }
    }

    //스택에서 해당 값 없애지 않고 현재 top을 보여주기
    public int peek() {
        if (isEmpty()) {
            System.out.println("Array stack is Empty");
            return -1;
        } else {
            return items.get(items.size()-1);
        }
    }
}



