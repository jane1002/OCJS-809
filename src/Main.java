import com.sun.xml.internal.xsom.impl.scd.Step;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
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
        System.out.println("Q11");
        Stream<List<String>> iStr= Stream.of(
                Arrays.asList ("1", "aaa"),
                Arrays.asList ("2", null));
        Stream<String> nInSt = iStr.flatMap((x) -> x.stream());
         nInSt.forEach (System.out :: print);
        System.out.println();

         //Q12
      /*  Path file = Paths.get("course.txt");
        try (Stream<String> lines = Files.lines(file)) {
            lines.forEach(s -> System.out.println(s));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<String> lines = Files.readAllLines(file);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        //Q17
        System.out.println("Q17:");
        Book b1 = new Book(101, "java pro");
        Book b2 = new Book(102, "java pro");
        System.out.println(b1.equals(b2));

        //Q
        // result : Exception in thread "main" java.lang.ClassCastException: Vehicle2 cannot be cast to java.lang.Comparable
        /*TreeSet<Vehicle2> vehicles = new TreeSet <> ();
        vehicles.add(new Vehicle2 (10123, "Ftrd"));
        vehicles.add(new Vehicle2 (10124, "BMW"));
        System.out.println(vehicles);*/

        //Q54
        List<Integer> codes = Arrays.asList(10, 20);
        UnaryOperator<Integer> uo = s -> s + 10;
        codes.replaceAll(uo);
        codes.forEach(num -> System.out.println(num));

        //Q96
        String message = "Hi everyone!";
        System.out.println("message = " + message.replace("e", "X"));

        //Q103
        Test2 t = new Test2();
            // insert code here to write field variables
        t.fvar = 200;
        Test2.cvar = 400;

        //Q124
        char x = 8;
        int z = '8';
        System.out.println(doMsg(x));
        System.out.print(doMsg(z));


    }

    public static String doMsg(char x) {
        return "Good Day!";
    }

    public static String doMsg(int y) {
        return "Good Luck!";
    }


}
