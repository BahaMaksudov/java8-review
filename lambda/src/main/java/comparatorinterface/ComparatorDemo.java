package comparatorinterface;

import java.nio.MappedByteBuffer;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class ComparatorDemo {

    public static void main(String[] args) {

/*        List<Integer> list =Arrays.asList(10,0,15,5,20);
        System.out.println(list);


        System.out.println("*******Test**********");
        int num = 25;
        System.out.println((num>0) ? -1 : (num<0) ? 1: 0);



        //sorting in Ascending order
        Collections.sort(list);
        System.out.println(list);



        //Descending order sorting
        Collections.sort(list,new MyComparator());
        System.out.println(list);

        //sort order using Lambda
        Collections.sort(list, ((o1, o2) -> (o1>o2) ? -1 : (o2<o1) ? 1: 0));

        //Ascending using compareTo
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        //Descending order --> change the o1 and o2 - it will go to the MyComparator class and use method
        list.sort((o2, o1) -> o1.compareTo(o2));
        System.out.println(list);

        //Comparator.comparing static method

        List<Apple> myInventory = Arrays.asList(
                new Apple(80,Color.GREEN),
                new Apple(155,Color.RED),
                new Apple(120,Color.GREEN)
        );

        Comparator sortApple = comparing((Apple apple)-> apple.getWeight());
        myInventory.sort(sortApple);
        System.out.println(myInventory);

        myInventory.sort(comparing((apple)-> apple.getWeight())); //simplified method, importing static method
        //using double colon ::
        myInventory.sort(comparing(Apple::getWeight));
        System.out.println(myInventory);

        //reverse order
        myInventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(myInventory);

        //Chaining - this how you can separate more clear
        myInventory
                .sort(comparing(Apple::getWeight)
                        .reversed()
                        .thenComparing(Apple::getColor));
        System.out.println(myInventory);

*/



        List<Integer> listNew = Arrays.asList(12,45,32,67,2,87,2,4,1,5);
        System.out.println(listNew);

        Collections.sort(listNew);
        System.out.println(listNew);


        //BY using behavior parameterization, creating a claas with abstract method and using in-built Collection interface
        Collections.sort(listNew,new MyComparator());
        System.out.println(listNew);

        //functional interface has 1 abstract method, we can skip the middle layer (MyComparator class, implementation class)
        // and directly use lambda expression

        //Ascending order, using in-built functional interface Collections
        //using lambda and passing implementation directly in the lambda expression
        Collections.sort(listNew, ((o1,o2) -> (o1>o2) ? -1 : (o1<o2) ? 1: 0));
        System.out.println(listNew);

        //Ascending order by using Compare in-built method, skipping intermediate interface
        //the result the sma as previous implementation
        listNew.sort(((o1, o2) -> o1.compareTo(o2)));
        System.out.println(listNew);

        //Descending order by using compare in-built method
        listNew.sort(((o1, o2) -> o2.compareTo(o1)));
        System.out.println(listNew);


        //Comparator.comparing method usage
        List<Apple> myInventory = Arrays.asList(
                new Apple(80,Color.GREEN),
                new Apple(155,Color.RED),
                new Apple(120,Color.GREEN)
        );

        Comparator<Apple> sortApple = comparing((apple) -> apple.getWeight());
        myInventory.sort(sortApple);
        System.out.println(myInventory);

        myInventory.sort(comparing((apple) -> apple.getWeight()));
        //if in the labmda expression we directly call instance or static method, we can use :: operator
        myInventory.sort(comparing(Apple::getWeight));
        System.out.println(myInventory);

        myInventory.sort(comparing(Apple::getWeight).reversed()); //reversing the sorting

        //Chaining
        myInventory.sort(comparing(Apple::getWeight)
                .reversed()
                .thenComparing(Apple::getColor));
        System.out.println(myInventory);

    }


}
