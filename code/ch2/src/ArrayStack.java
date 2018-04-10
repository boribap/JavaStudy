public class ArrayStack {
    public int top;
    public int[] itemArray;
    public int stackSize;

    //생성자
    public ArrayStack(int stackSize) {
        itemArray = new int[stackSize];
        top = -1;
        this.stackSize = stackSize;
    }

    //스택이 비어있는지 검사
    public boolean isEmpty() {
        return (top == -1);
    }

    //스택이 꽉 차 있는지 검사
    public boolean isFull() {
        return (top == this.stackSize - 1);
    }

    //스택에 아이템 추가
    public void push(int item) {
        if (isFull()) {
            System.out.println("Array Stack is full");
        } else {
            top++;
            itemArray[top] = item;
            System.out.println("Inserted item : " + item);
        }
    }

    //스택의 top에 있는 아이템 반환
    public int pop() {
        if (isEmpty()) {
            System.out.println("Array Stack is empty");
            return -1;
        } else {
            return itemArray[top--];
        }
    }

    //스택에서 해당 값 없애지 않고 현재 top을 보여주기
    public int peek() {
        if (isEmpty()) {
            System.out.println("Array stack is Empty");
            return -1;
        } else {
            return itemArray[top];
        }
    }
}


