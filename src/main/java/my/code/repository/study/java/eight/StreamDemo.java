package my.code.repository.study.java.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author djh on  2019/4/3 21:16
 * @E-Mail 1544579459@qq.com
 */
public class StreamDemo {
    static class MyCollector implements Collector<String, List<String>, List<String>> {

        @Override
        public Supplier<List<String>> supplier() {
            return ArrayList::new;
        }

        @Override
        public BiConsumer<List<String>, String> accumulator() {
            return List::add;
        }

        @Override
        public BinaryOperator<List<String>> combiner() {
            return (strings, strings2) -> {
                strings.addAll(strings2);
                return strings;
            };
        }

        @Override
        public Function<List<String>, List<String>> finisher() {
            return Function.identity();
        }

        @Override
        public Set<Characteristics> characteristics() {
            return null;
        }
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"A", "B", "C", "D", "EFG"};
        Stream<String> stream = Arrays.stream(strings);

        Map<Integer, Long> map = stream.collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(map);
    }
}