package OptionSrc;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Person {
    private Optional<String> firstName;
    private Optional<String> lastName;
    private Optional<Integer> age;

    public void setFirstName(String firstName) {
        this.firstName = Optional.ofNullable(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = Optional.ofNullable(lastName); // returns empty optional
    }

    public Optional<String> getLastName() {
        return lastName;
    }

    public Optional<String> getFirstName() {
        return firstName;
    }

    public void setAge(Integer age) {
        this.age = Optional.ofNullable(age);
    }

    public Optional<Integer> getAge() {
        return age;
    }
}
