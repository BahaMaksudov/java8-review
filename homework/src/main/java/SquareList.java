import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareList {
    public static void main(String[] args) {


        List<Integer> listSquare = Arrays.asList(1,2,3,4,5);
        List<Integer> newList1 = listSquare.stream().map(n->n*n).collect(Collectors.toList());
        newList1.forEach(System.out::println);


        System.out.println("--------------------");
        List<Integer> numbers1 = Arrays.asList(1,2,3);
        List<Integer> numbers2 = Arrays.asList(3,4);
        List<int[]> pairs = numbers1.stream()
                .flatMap(i->numbers2.stream()
                        .map(j->new int[]{i,j}))
                .collect(Collectors.toList());

        pairs.forEach(h->System.out.println("["+h[0]+","+h[1]+"]"));


        System.out.println("********Fibonacci********");
        Stream.iterate(new int[]{0,1}, n->new int[]{n[1],n[0]+n[1]})
                .limit(20)
                .forEach(n-> System.out.println("["+n[0]+","+n[1]+"]"));

        System.out.println("******Normal way Fibonacci******");
        List<int[]> ls = Stream.iterate(new int[]{0,1}, n->new int[]{n[1],n[0]+n[1]})
                .limit(20)
                //.map(n->n[0])
                .collect(Collectors.toList());
        ls.forEach(n->System.out.print( n[0] + n[1] + " "));



    }



}
