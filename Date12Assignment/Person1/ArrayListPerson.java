package Date12Assignment.Person1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPerson {
    public static void main(String[] args) {
        List<Person1> first = new ArrayList<>();
        List<Person1> second = new ArrayList<>();

        // Adding 5 persons to the first list
        first.add(new Person1("arun", 34, "lingapura"));
        first.add(new Person1("kiran", 23, "hosahalli"));
        first.add(new Person1("vinod", 455, "belagaum"));
        first.add(new Person1("sahana", 34, "jagaluru"));
        first.add(new Person1("sunil", 24, "chikkaballapura"));

        // Adding 5 persons to the second list
        second.add(new Person1("bharath", 28, "davangere"));
        second.add(new Person1("roopa", 21, "bengaluru"));
        second.add(new Person1("deepak", 29, "mysuru"));
        second.add(new Person1("lakshmi", 32, "tumakuru"));
        second.add(new Person1("ravi", 26, "mandya"));

        // Optional: Print both lists
        System.out.println("First List:");
        for (Person1 p : first) {
            System.out.println(p);
        }

        System.out.println("\nSecond List:");
        for (Person1 p : second) {
            System.out.println(p);
        }
        List<Person1>  per=new ArrayList<>();
        for(Person1 one:first){
            if(second.contains(one)){

               per.add(one);
            }
        }
        for(Person1 t:per){
            System.out.println(t);
        }

    }
}
