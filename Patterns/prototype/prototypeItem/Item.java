package prototypeItem;

public class Item implements Copyable {
    public enum Type {
        FIRST,
        SECOND
    }
    private Type type;

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public Item copy() {
        var copyItem = new Item();
        return copyItem;
    }

}
