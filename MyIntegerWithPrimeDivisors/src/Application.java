import util.MyInteger;

import java.util.TreeSet;

public class Application {
    public static void main(String[] args) {
        TreeSet<MyInteger> set = new TreeSet<>();
        set.add(new MyInteger(105));
        set.add(new MyInteger(155));
        set.add(new MyInteger(178));
        set.add(new MyInteger(5));
        set.add(new MyInteger(555));
        System.out.println(set);
    }
}
