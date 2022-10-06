import learningLambda.Converter;
import learningLambda.Dog;
import learningLambda.Racoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Optional<Converter<Dog, Racoon>>> h;
        var dog = new Dog("Bob", 5, 3);
        Converter<Dog, Racoon> converter = x -> new Racoon(dog.getName(), dog.getAge(), dog.getWeight());
        var racoon = converter.convert(dog);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Bob");
        arrayList.add("Robert");
        arrayList.add("Adam");
        arrayList.add("David");
        arrayList.add("Valentin");

        int sizeOfNewArrayList = 5;


        // Lazy stream generator
         Stream.generate(() -> {
                    int value = (int) (Math.random() * arrayList.size());
                    return arrayList.get(value);
                }).limit(sizeOfNewArrayList)
                .forEach(System.out::println);

    }
}
