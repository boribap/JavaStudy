import java.util.Vector;

public class quiz5 {
    public class Student {
        private String name;
        //다중성을 위해 컬렉션 자료구조인 벡터 사용. 이외에도 set,map,arraylist 등 여러가지 사용 가능.
        private Vector<Course> courses;

        public Student(String name){
            this.name = name;
            courses = new Vector<Course>();
        }

        public void registerCourse(Course course){
            courses.add(course);
        }

        public void dropCourse(Course course){
            if(courses.contains(course)){
                courses.remove(course);
            }
        }

        //강의를 참조
        public Vector<Course> getCourses() {
            return courses;
        }
    }

    //학생에서 강의클래스로 향하느 단방향이므로 강의클래스에는 학생클래스를 참조하는 속성이 없다.
    public class Course {

        private String name;

        public Course(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
