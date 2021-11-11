package listas;

import java.util.ArrayList;
import java.util.List;

public class ListsTimes {
    public static void main(String[] args) {
        List<String> times = new ArrayList<>();
        times.add("Inter");
        times.add("River");
        times.add("Roma");
        times.add("Liverpool");
        System.out.println(times);
       // times.remove("Roma");
        System.out.println(times);
        System.out.println(times.get(1));
        times.add("Barcelona");
        System.out.println(times);
    }
}
