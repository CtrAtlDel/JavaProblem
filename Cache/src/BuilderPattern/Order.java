package BuilderPattern;

public class Order {
    private int id;
    private String name;
    private String secondName;

    public Order(OrderBuilder orderBuilder) {
        this.id = orderBuilder.id;
        this.name = orderBuilder.name;
        this.secondName = orderBuilder.secondName;
    }


    public static class OrderBuilder {
        protected int id;
        protected String name;
        protected String secondName;

        public OrderBuilder() {
            super();
        }

        public OrderBuilder id(int id) {
            this.id = id;
            return this;
        }

        public OrderBuilder name(String name) {
            this.name = name;
            return this;
        }

        public OrderBuilder secondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
