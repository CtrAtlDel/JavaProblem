package OptionSrc;

import java.util.stream.LongStream;

public class ParallelMain {
    public static void main(String[] args) {
        long result;
        result = LongStream.range(0, 1_000_000_000)
                .boxed()
                .parallel()
                .map(x -> x / 7)
                .peek(v -> System.out.println(Thread.currentThread().getName())).reduce((x, y) -> x + (int) (3 * Math.sin(y)))
                .get();
        System.out.println(result);
    }
}