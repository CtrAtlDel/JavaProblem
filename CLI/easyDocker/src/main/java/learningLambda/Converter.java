package learningLambda;

@java.lang.FunctionalInterface
public interface Converter<T, N> {
    N convert(T string);

    // Можно использовать статические методы
    static <T> boolean isNotNull(T t) {
        return t != null;
    }

    // Можно использовать дефолтыне методы
    default void writeHi(){
        System.out.println("hi");
    }
}