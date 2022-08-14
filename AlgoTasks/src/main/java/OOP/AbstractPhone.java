package OOP;

public abstract class Abstract {
    private int year;

    public Abstract(int year){
        this.year = year;
    }

    public abstract void call(int number);
    public abstract void ring(int outputNumber);
}
