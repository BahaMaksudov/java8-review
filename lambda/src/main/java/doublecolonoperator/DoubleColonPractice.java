package doublecolonoperator;

import java.util.function.Function;
import java.util.function.Supplier;

public class DoubleColonPractice {

    public static void main(String[] args) {

        Supplier<Car> car = ()-> new Car();
        System.out.println(car.get().getMake());

        Supplier<Car> car1 = Car::new;
        System.out.println(car1.get().getModel());

        Function<Integer, Car > s1 = model -> new Car(model);
        Car bmw = s1.apply(2010);
        System.out.println(bmw.getModel());
    }
}
