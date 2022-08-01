package Lambda;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test3 {

    public static ArrayList<Car> threeCarArrayListMaker(Supplier<Car> carSupplier) {
        ArrayList<Car> aList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            aList.add(carSupplier.get());
        }
        return aList;
    }

    public static void changeCar(Car car, Consumer<Car> changedCar) {
        changedCar.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars =
                threeCarArrayListMaker(() -> new Car("Scoda Octavia", "white", 1.4));

        System.out.println(ourCars);

        changeCar(ourCars.get(0), ch -> {
            ch.color = "Silver";
            ch.engine = 2.0;
            ch.model = "Haval";
            System.out.println(ch);
        } );
    }
}

class Car {
    String model;
    String color;
    Double engine;

    public Car(String model, String color, Double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
