public class Person {
    private final String firstName;
    private final String secondName;

    public Person(final String firstName, final String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public static class Builder {
        private String firstName;
        private String secondName;


        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setSecondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public Person build() {
            return new Person(firstName, secondName);
        }
    }

    @Override
    public String toString() {
        return "First name: " + firstName
                + "\n"
                + "Second name: " + secondName;
    }
}
