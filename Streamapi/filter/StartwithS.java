package Streamapi.filter;

import java.util.Arrays;
import java.util.List;

public class StartwithS {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("samaantha","nagachai","nagarjuna","saroja");
        names.stream().filter(n->n.startsWith("s")).toList().forEach(n-> System.out.println(n));
    }
}
