import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Reducing {
    public static void main(String[] args) {

//        List<Integer> numbers = Arrays.asList(4,5,3,9);
//        int result = numbers.stream().reduce(0,(a,b) -> a+b);
//        System.out.println(result);
//
//        //No initial value
//        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a+b);
//        System.out.println(result2);
//
//        //Max and Min
//        Optional<Integer> min = numbers.stream().reduce(Integer::min);
//        Optional<Integer> max = numbers.stream().reduce(Integer::max);
//        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
//
//        System.out.println("Min:" + min.get());
//        System.out.println("Max:" + max.get());
//        System.out.println("Sum:" + sum.get());
//
//        //Task
//        int dishCount = DishData.getAll().stream().map(d -> 1).reduce(0,(a,b) -> a+b);
//        System.out.println(dishCount);
//
//        long dcount = DishData.getAll().stream().count();
//        System.out.println(dcount);

        List<Integer> numbers = Arrays.asList(1,2,3,4);

        int result = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(result);

        Optional result2 = numbers.stream().reduce((a,b)->a+b);
        System.out.println(result2);

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("Min = "+ min.get());
        System.out.println("Max = "+ max.get());
        System.out.println("Sum = "+ sum.get());


        List<String> list = Arrays.asList("Baha","Man","Home");
        Optional <String> str = list.stream().reduce((a,b)->a+b);
        System.out.println(str.get());

        int numDish = DishData.getAll().stream()
                .map(d->1).reduce(0,(a,b)->a+b);

        long dishCount = DishData.getAll().stream().count();


        Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]})
        .limit(20)
                .forEach(t -> System.out.println("("+t[0]+","+t[1]+")"));

    }
}
