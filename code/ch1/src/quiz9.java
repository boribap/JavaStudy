public class quiz9 {
    public class Person{
        //이 속성으로 연관관계가 설정된다.
        private Car owns;

        public void setCar(Car car){
            this.owns = car;
        }

        public Car getCar() {
            return this.owns;
        }
    }

    public class Car{
        private Person person;
    }
}
