package nested_classes.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsepower);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public  class Engine {
        int horsepower;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }

        @Override
        public String toString() {
            return "My engine{" +
                    "horsepower=" + horsepower +
                    '}';
        }
    }
}
class Test {
    public static void main(String[] args) {
        Car car = new Car("black", 4);
        System.out.println(car);
        Car.Engine engine = car.new Engine(150);
        System.out.println(car);
        car.setEngine(engine);
        System.out.println(car);

        Car.Engine engine3 = new Car("yellow", 4).new Engine(100);
        System.out.println(engine3);

    }

}
