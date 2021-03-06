# Comparable & Comparator

- 객체의 정렬 기준을 명시하는 두가지 방법

## Interface Comparable

- 정렬 수행시 기본적으로 적용되는 정렬기준이 되는 메서드를 정의하는 인터페이스
- java.lang.Comparable
- java에서 제공되는 정렬이 가능한 클래스들은 모두 Comparable 인터페이스를 구현하고 있으며, 정렬시 이에 맞게 정렬이 수행된다.

- 구현 방법
    - 정렬할 객체에 Comparable interface를 implements 한 뒤, compareTo() 메서드를 오버라이드하여 구현한다.
    - compareTo() 메서드 작성법
        - 현재객체 < 파라미터로 넘어온 객체    →    음수리턴
        - 현재객체 == 파라미터로 넘어온 객체    →    0 리턴
        - 현재객체 > 파라미터로 넘어온 객체    →    양수리턴

        → 음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우에는 두 객체의 자리가 바뀐다. 

        ex) Arrays.sort(array) - 배열 정렬  /  Collection.sort(list) - 리스트 콜랙션 정렬 

        - 배열 정렬 : byte[], char[], double[], int[], Object[], T[] 등
        - 리스트 콜렉션 정렬 : ArrayList, LinkedList, Vector 등

        ``` 
        // x좌표가 증가하는 순, x좌표가 같으면 y좌표가 감소하는 순으로 정렬하라 
        
        class Point implements Comparable<Point> {
        	int x,y;
        	
        	@override
        	public int compareTo(Point p){
        		if(this.x > p.x) {
        			return 1; // x에 대해서는 오름차순
        		} else if(this.x == p.x) {
        			if(this.y < p.y) { // y에 대해서는 내림차순 
        				return 1;
        			}
        		}
        		return -1;
        	}
        }
        
        // main 에서 사용법
        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(x,y));
        Collections.sort(pointList);
        
        ``` 

## Interface Comparator

- 정렬 가능한 클래스(comparable 인터페이스를 구현한 클래스)들의 기본 정렬 기준과 다르게 정렬하고 싶을 때 사용하는 인터페이스
- java.util.Comparator
- 주로 익명 클래스로 사용된다
- 기본적인 정렬방법인 오름차순 정렬을 내림차순으로 정렬할때 많이 사용

- 구현 방법
    - Comparator interaface를 implement 한 후, compare() 메서드를 오버라이드한 myComparator class를 작성한다.
    - compare() 메서드 작성법
        - 첫번째 파라미터로 넘어온 객체 < 두번째 파라미터로 넘어온 객체    →    음수리턴
        - 첫번째 파라미터로 넘어온 객체 == 두번째 파라미터로 넘어온 객체    → 0 리턴
        - 첫번째 파라미터로 넘어온 객체 > 두번째 파라미터로 넘어온 객체    → 양수리턴

        → 음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우에는 두객체의 자리가 변경된다. 

        ex) Arrays.sort(array, myComparator) / Collections.sort(list, myComparator) 

        → 두번째 인자로 Comparator interface를 받을 수 있음. 이 경우에는 우선순위큐(Priority queue) 생성자의 두번째 인자로 Comparator interface를 받을 수 있다. → 지정된 Comparator의 정렬방법에 따라 우선순위를 할당한다. 
        
        ```
        1. Comparator Interface 를 이용한 java 객체를 정렬 
        
        // x좌표가 증가하는 순, x좌표가 같으면 y좌표가 감소하는 순으로 정렬
        class MyComparator implements Comparator<Point> {
        	@override
        	public int compare(Point p1, Point p2){
        		if(p1.x > p2.x) {
        			return 1; // x 에 대해서는 오름차순
        		} else if (p1.x == p2.x) {
        			if(p1.y < p2.y) { // y에 대해서는 내림차순
        				return 1;
        			}
        		}
        		return -1;
        	}
        }
        
        // main()에서 사용법
        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(x,y));
        MyComparator myComparator = new MyComparator();
        Collections.sort(pointList, myComparator);

        ``` 
        
        ```
        2. Comparator 익명 클래스 이용
        
        Comparator<Point> myComparator = new Comparator<Point>() {
        	@override
        	public int compare(Point p1, Point p2) {
        		.. 상동
        	}
        };
        
        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(x,y));
        Collections.sort(pointList, myComparator);
        ```
        
