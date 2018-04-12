import java.util.ArrayList;

public class quiz6 {
    public class MyStack<String> {//위임 과정 3. 일반화 관계를 제거하고
        //private ArrayList<String> arList = this;  // 위임 과정 1. ArrayList 인스턴스를 참조하는 arList를 만든 뒤 this로 초기화.
        private ArrayList<String> arList = new ArrayList<String>(); //위임과정 3. arList를 ArrayList 객체로 생성해 초기화 한다.
        public void push(String element){
            arList.add(element); //위임 과정 2. 참조대상을 변경한다.
        }

        public String pop(){
            return arList.remove(arList.size() -1); //위임 과정 2. 참조대상을 변경한다.
        }

        public boolean isEmpty(){
            return arList.isEmpty(); //위임과정 4. 이외에 다른 필요한 기능이 있다면 arList에서 사용하면된다.
        }
    }
}
