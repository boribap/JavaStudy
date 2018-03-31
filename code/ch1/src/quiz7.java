import java.util.Iterator;
import java.util.Vector;

public class quiz7 {

    public class Student {
        private String name;
        private Vector<Transcript> transcripts;

        public Student(String name){
            this.name = name;
            transcripts = new Vector<Transcript>();
        }

        public void addTranscript(Transcript transcript){
            transcripts.add(transcript);
        }

        public Vector<Course> getCourses(){
            Vector<Course> courses = new Vector<Course>();
            //각 학생이 듣는 수업의 성적을 iterator로 돌면서 학생의 강의 목록에 추가한다.
            Iterator<Transcript> iterator = transcripts.iterator();

            while(iterator.hasNext()){
                Transcript tr = iterator.next();
                courses.add(tr.getCourse());
            }
            return courses;
        }

    }

    public class Transcript {
        private String date;
        private String grade;

        private Student student;
        private Course course;

        public Transcript(Student student, Course course){
            this.student = student;
            this.course = course;
            this.student.addTranscript(this);
            this.course.addTranscript(this);
        }

        public Student getStudent() {
            return student;
        }

        public Course getCourse() {
            return course;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getDate() {
            return date;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getGrade() {
            return grade;
        }
    }

    public class Course {
        private String name;
        private Vector<Transcript> transcripts;

        public Course(String name){
            this.name = name;
            transcripts = new Vector<Transcript>();
        }


        public void addTranscript(Transcript transcript){
            transcripts.add(transcript) ;
        }

        public String getName() {
            return name;
        }
    }

    public class Main{
        public void main(String[] args){
            Student s1 = new Student("bowon");
            Student s2 = new Student("sungwon");

            Course c1 = new Course("java");
            Course c2 = new Course("c") ;

            Transcript t1 = new Transcript(s1, c1);
            Transcript t2 = new Transcript(s1, c2);
            Transcript t3 = new Transcript(s2, c1);

            t1.setDate("2012");
            t1.setGrade("A+");
            t2.setDate("2012");
            t2.setGrade("A+");
            t3.setDate("2012");
            t3.setGrade("A+");

            Vector<Course> courses;
            courses = s1.getCourses();

            //s1학생이 듣는 강의목록을 출력한다.
            for (int i = 0; i < courses.size(); i++){
                System.out.println(courses.get(i).getName());
            }
        }
    }
}
