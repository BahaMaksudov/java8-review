package functionalinterfaces;

import java.util.function.*;

public class functionsPractice {
    public static void main(String[] args) {

//*******************PREDICATE Interface java built in Interface
        //below option is using anonymous class not and Object
//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer<18;
//            }
//        };
//        System.out.println(lesserThan.test(17));

        Predicate<Integer> lesserThan = a -> a<18;
        Boolean result = lesserThan.test(18);
        System.out.println(result);
        //System.out.println(lesserThan.test(20));

//*******************CONSUMER********************
        Consumer<String> consumerName = t-> System.out.println(t);
        consumerName.accept("Baha");

        //*******************CONSUMER********************
        BiConsumer<Integer, Integer> twoNames = (x,y) -> System.out.println(x*y);
        twoNames.accept(25,25);

//*******************BINARY OPERATOR EXTENDS BI-FUNCTION********************
        BinaryOperator<Integer> test = (e,t) -> {
            int sum = e+t;
            return sum;
        };
        int newSum = test.apply(5,5);
        System.out.println(newSum);

//*******************IntToDoubleFunction********************
        IntToDoubleFunction doubleFunc = h -> h+20;
        System.out.println(doubleFunc.applyAsDouble(10));

    }
}
