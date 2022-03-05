package OptionSrc;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Person> somePerson = Optional.empty();
        Optional<Person> otherPerson = Optional.of(new Person());
        var optionalNotNull = Optional.of(new Person());
        Optional<Person> maybeNullPerson = Optional.ofNullable(null);
        var person = somePerson.orElse(new Person()); // = somePerson or new Person
//        Person personException = otherPerson.orElseThrow(Exception::new);

    }
}
