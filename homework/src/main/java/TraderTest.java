import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class TraderTest {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)
                );


        // 1. Find all transactions in the year 2011 and sort them by value (small to high)
        System.out.println("----Sort-by-Value----");
        transactions.stream()
                .filter(p->p.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .map(Transaction::getValue)
                .forEach(System.out::println);


        // 2. What are all the unique cities where the traders work?
        System.out.println("------Unique--Cities------");
        transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

      //  3. Find all traders from Cambridge and sort them by name.
        System.out.println("-----Traders--from--Cambridge-----");
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);


      //  4. Return a string of all traders’ names sorted alphabetically.
//        System.out.println("---Return--All--Traders--Alphabetically---");
//        transactions.stream()
//                .map(transaction -> transaction.getTrader().getName())
//                .distinct()
//                .sorted()
//                        .forEach(System.out::println);9

        System.out.println("---Return--All--Traders--Alphabetically---");
        String names =transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(n1,n2)-> n1+n2 + " ");

        System.out.println(names);

      //  5. Are any traders based in Milan? - boolean?
        System.out.println("----Any--Traders--From--Milan?----");
        boolean liveInMilan = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader()
                                .getCity()
                                .equals("Milan"));
        System.out.println(liveInMilan);

        transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Milan"))
                .distinct()
                .forEach(System.out::println);


      //  6. Print the values of all transactions from the traders living in Cambridge.




      //  7. What is the highest value of all the transactions?
        System.out.println("----Highest--Value--Of--All--Transactions----");
        Optional<Integer> highValue = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(highValue);

      //  8. Find the transaction with the smallest value.
        System.out.println("----Smallest--Value--Of--All--Transactions----");
        Optional<Integer> smallValue = transactions.stream()
                .map(Transaction::getValue)
                        .reduce(Integer::min);
        System.out.println(smallValue);

    }
}
