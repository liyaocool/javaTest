package strems.traderTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raou1", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //1.找出2011年的所有交易并按交易额排序(从低到高)
        List<Transaction> tr2011 = transactions.stream().filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(toList());
        System.out.println(tr2011);

        //2.交易员都在哪些不同城市工作过
        List<String> cities = transactions.stream().map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());
        System.out.println(cities);

        //3.查找所有来自剑桥的交易员，并按姓名排序
        List<Trader> traders = transactions.stream().map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(toList());
        System.out.println(traders);

        //4.返回所有交易员的姓名字符串，按字母顺序排序
        String traderStr = transactions.stream().map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (str1, str2) -> str1 + str2);
        System.out.println(traderStr);
        //因为上述存在a和b字符串反复拼接比较,所以改进方案如下：
        String traderStr2 = transactions.stream().map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(joining());

        //5.有没有交易员是在米兰工作的
        boolean milanBased = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milanBased);

        //6.打印生活在剑桥的交易员的所有交易额
        transactions.stream().filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //7.所有交易中，最高的交易额是多少？
        Optional<Integer> highestValue = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
        System.out.println(highestValue);

        //8.找到交易额最小的交易
        Optional<Integer> smallestValue = transactions.stream().map(Transaction::getValue).reduce(Integer::min);
        //或者,Optional为容器类
        Optional<Transaction> smallestValue2 = transactions.stream().reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
        System.out.println(smallestValue);
        System.out.println(smallestValue2);
    }
}