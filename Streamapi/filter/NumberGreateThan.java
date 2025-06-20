package Streamapi.filter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberGreateThan {
    public static void main(String[] args) {
//        List<Integer> numbers= Arrays.asList(25,50,75,100);
////        numbers.stream().filter(n->(n>50)).toList().forEach(n-> System.out.println(n));
//        List<String> words = Arrays.asList("hi", "yes", "code", "java");
////        words.stream().filter(n->(n.length()>3)).toList().forEach(n-> System.out.println(n));
//        List<Boolean> values = Arrays.asList(true, false, true, false);
//        values.stream().filter(n->(n==true)).toList().forEach(n-> System.out.println(n));
List<String> fruits=Arrays.asList("banana","apple","mango","banana","ajja");
//Set<String> set=new HashSet<>();
//String str="";
//fruits.stream().forEach(n->set.add(n));
//System.out.print(set);
//     List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,8);
//     numbers.stream().limit(4).toList().forEach(n-> System.out.println(n));
// fruits.stream().distinct().toList().forEach(n-> System.out.println(n));
// List<String>upper=fruits.stream().map(a->a.toUpperCase()).toList();
//        System.out.println(upper);

        Long an=fruits.stream().filter(name->name.startsWith("a")).count();
    }
}
