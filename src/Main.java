import com.sun.xml.internal.xsom.impl.scd.Step;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.function.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Q1
        Vehicle v = new Vehicle(100);
        v.increSpeed(60);
        // Q2
        IntStream stream = IntStream.of(1, 2, 3);
        IntFunction<IntUnaryOperator> inFu = x -> y -> x * y; //line n1
        //IntStream newStream = (IntStream) stream.map(inFu.apply(10)); //line n2
        IntStream newStream = stream.map(inFu.apply(10));
        newStream.forEach(System.out::print);
        System.out.println();

        //Q3
        List<Integer> values = Arrays.asList(1, 2, 3);
        values.stream()
                .map(n -> n * 2) //line n1
                .peek(System.out::print) //line n2
                .count();
        System.out.println();

        //Q6
        int a = 10;
        int b = -1;
        assert (b >= 1) : "Invalid Denominator";
        int c = a / b;
        System.out.println(c);

        //Q7
        Birdie.fly( ( ) -> new Bird ( ));

        //Q9
        System.out.println("Q9: ");
        ForkJoinPool fPttl = new ForkJoinPool ( );
        int data [ ] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        fPttl.invoke (new Sum (data, 0, data.length));

        //Q10
        Foo<String, Integer> mark = new Foo<String, Integer>("sTEVE", 100);
        Foo<String, String> pair = Foo.<String>twice ("Hellt Wtrld!");
        Foo<?, ?> percentage = new Foo<> (97, 32);
        Foo<String, String> grade = new Foo<> ("Hellt Wtrld!", "A");

        //Q11
        Stream<List<String>> iStr= Stream.of(
                Arrays.asList ("1", "aaa"),
                Arrays.asList ("2", null));
        Stream<String> nInSt = iStr.flatMapToInt((x) -> {
            return x.stream();
        });
         nInSt.forEach (System.out :: print);

    }


}
