package learningLambda;

@java.lang.FunctionalInterface
public interface Converter<T, N> {
    N convert(T obj);

    // Можно использовать статические методы
    static <T> boolean isNotNull(T t) {
        return t != null;
    }
//    Статический инициализатор

    // Можно использовать дефолтыне методы
    default void writeHi(){
        System.out.println("hi");
    }

    boolean equals(Object obj);

}