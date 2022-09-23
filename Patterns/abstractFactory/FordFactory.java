package AbstractFactory;

import AbstractFactory.BluePrints.Coupe;
import AbstractFactory.BluePrints.Sedan;
import AbstractFactory.BluePrints.Cabriolet;

public class FordFactory implements CarsFactory {
    @Override
    public Sedan createSedan() {
        return new Sedan();
    }

    @Override
    public Coupe createCoupe() {
        return new Coupe();
    }

    @Override
    public Cabriolet createCabriolet() {
        return new Cabriolet();
    }
}
