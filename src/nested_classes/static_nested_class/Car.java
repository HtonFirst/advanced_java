package nested_classes.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
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

    public static class Engine {
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
        Car.Engine myEngine = new Car.Engine(256);
        System.out.println(myEngine);

        Car car = new Car("blue", 4, myEngine);
        System.out.println(car);
    }

}
