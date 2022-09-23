package AbstractFactory;

import AbstractFactory.BluePrints.Cabriolet;
import AbstractFactory.BluePrints.Coupe;
import AbstractFactory.BluePrints.Sedan;

public interface CarsFactory {
    Sedan createSedan();
    Coupe createCoupe();
    Cabriolet createCabriolet();
}
