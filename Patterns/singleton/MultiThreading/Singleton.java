/* Нет проблем с многопоточностью, но потеряли ленивуюю реализацию */
/* Ленивая реализация - объект создается при первом вызове*/
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){}
    public static Singleton getInstance() {
        return instance;
    }
}


