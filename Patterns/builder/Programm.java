

public class Programm {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                                  .setFirstName("John")
                                  .setSecondName("Teapot")
                                  .build();
        System.out.println(person);
    }
};