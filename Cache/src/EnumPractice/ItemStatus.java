package EnumPattern;

public enum ItemStatus {
    HIDDEN((short) 0),
    PUBLISHED((short) 1);
    private final short val;

    ItemStatus(short val) {
        this.val = val;
    }

    public short getVal() {
        return val;
    }
}
