import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

//        //Print All cities in Massachusetts
//        System.out.println("-----MA STATE CITIES------");
//        MassState.cityNames()
//                .flatMap(p->p.getCities().stream())
//                .forEach(System.out::println);
//
//        //Print All cities in New York
//        System.out.println("-----NY STATE CITIES------");
//        NewYorkState.cityNames()
//                .flatMap(city -> city.getCities().stream())
//                .forEach(System.out::println);
//
//        //Print All MA and NY States names
//        System.out.println("-----MA & NY STATES CITIES------");
//

        System.out.println("----------------");
        State ma = new State();
        ma.addCity("Boston");
        ma.addCity("Sharon");
        ma.addCity("Franklin");
        ma.addCity("Norwood");

        System.out.println("----------------");
        State ri = new State();
        ri.addCity("Providence");
        ri.addCity("Lincoln");
        ri.addCity("Woonsocket");
        ri.addCity("Smithfield");

        List<State> list = Arrays.asList(ma,ri);

//        list.stream().map(state -> state.getCities()).forEach(System.out::println);

        list.stream()
                .map(state -> state.getCities())
                .flatMap(List::stream)
                .forEach(System.out::println);


    }
}
