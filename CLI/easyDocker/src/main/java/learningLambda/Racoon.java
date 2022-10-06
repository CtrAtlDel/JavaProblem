package learningLambda;

public class Racoon {
    String name;
    int age;
    int weight;

    @Override
    public String toString() {
        return "Racoon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public Racoon(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
