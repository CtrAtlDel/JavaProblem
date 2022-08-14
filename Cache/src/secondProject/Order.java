package secondProject;

import java.util.List;

public class Order {
    long id;
    String str;
    List<Items> list;


    public long getId() {
        return id;
    }

    public Order(long id, String str, List<Items> list) {
        this.id = id;
        this.str = str;
        this.list = list;
    }

    public List<Items> getList() {
        return list;
    }

    public String getStr() {
        return str;
    }
}
