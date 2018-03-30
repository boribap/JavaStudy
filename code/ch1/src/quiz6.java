import java.util.Vector;

public class quiz6 {
    public class Student {
        private String name;
        //강의를 참조하기 위한 속성. 다중성을 위해 컬렉션 자료구조인 벡터 사용. 이외에도 set,map,arraylist 등 여러가지 사용 가능.
        private Vector<Course> courses;

        public Student(String name){
            this.name = name;
            courses = new Vector<Course>();
        }

        public void registerCourse(Course course){
            courses.add(course);
            course.addStudent(this);
        }

        public void dropCourse(Course course){
            if(courses.contains(course)){
                courses.remove(course);
                course.removeStudent(this);
            }
        }

    }

    //학생에서 강의클래스로 향하느 단방향이므로 강의클래스에는 학생클래스를 참조하는 속성이 없다.
    public class Course {

        private String name;
        //학생을 참조하기 위한 속성.
        private Vector<Student> students;

        public Course(String name){
            this.name = name;
            students = new Vector<Student>();
        }

        public void addStudent(Student student){
            students.add(student);
        }

        public void removeStudent(Student student){
            students.remove(student);
        }

        //학생을 참조
        public Vector<Student> getStudents() {
            return students;
        }

        public String getName() {
            return name;
        }
    }
}
