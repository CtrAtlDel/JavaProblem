import learningLambda.Converter;
import learningLambda.Dog;
import learningLambda.Racoon;

import java.util.List;
import java.util.Optional;

public class Program {
    public static void main(String[] args) {
        List<Optional<Converter<Dog, Racoon>>> h;
        var dog = new Dog("Bob", 5, 3);
        Converter<Dog, Racoon> converter = x -> new Racoon(dog.getName(), dog.getAge(), dog.getWeight());
        var racoon = converter.convert(dog);
        System.out.println(racoon);
    }
}
