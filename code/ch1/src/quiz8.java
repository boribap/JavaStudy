public class quiz8 {
    public abstract class HomeAppliancies{
        private Integer serialNo;
        private String manufacturer;
        private Integer year;

        public abstract void turnOn();

        public abstract void turnOff();
    }

    public class Washer extends HomeAppliancies{
        @Override
        public void turnOn() {

        }

        @Override
        public void turnOff() {

        }
    }

    public class Freezer extends HomeAppliancies{
        @Override
        public void turnOn() {

        }

        @Override
        public void turnOff() {

        }
    }

    public class DishWasher extends HomeAppliancies{
        @Override
        public void turnOn() {

        }

        @Override
        public void turnOff() {

        }
    }
}
