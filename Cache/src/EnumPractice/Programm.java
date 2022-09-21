package EnumPattern;

public class Programm {
    public static void main(String[] args) {
        boolean flag = false;
        ItemStatus status = flag ? ItemStatus.PUBLISHED : ItemStatus.HIDDEN;
        System.out.println(status);
        System.out.println(status.getVal());
    }
}