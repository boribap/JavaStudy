public class quiz4 {
    public class Main {
        public void main(String[] args) {
            Professor ji = new Professor();
            Student bowon = new Student();

            ji.setStudent(bowon);
            ji.advise();
        }
    }
    public class Professor {
        private Student student;

        //양방향이어서 교수도 set을 설정
        public void setStudent(Student student){
            this.student = student;
            student.setAdvisor(this);
        }

        //선 위에 쓰여있는 역할에 대해 정의
        public void advise(){
            student.advise("상담한 내용");
        }
    }

    public class Student {
        private Professor advisor;

        //양방향 이어서 학생도 set을 설정
        public void setAdvisor(Professor advisor){
            this.advisor = advisor;
        }

        //양방향이어서 여기도 선 위에 있는 역할에 대해 정의
        public void advise(String msg){
            System.out.println(msg);
        }
    }
}
