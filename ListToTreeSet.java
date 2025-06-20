import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class ListToTreeSet {
    TreeSet  removeduplicates(List<String> strings){
        TreeSet<String> set=new TreeSet<>();
        for(int i=-0;i<strings.size();i++){
            set.add(strings.get(i));
        }
        return set;
    }

    public static void main(String[] args) {
        List<String> list= Arrays.asList("banana","apple","mango","banana");
        TreeSet<String> seett=new TreeSet<>();
        ListToTreeSet listtt=new ListToTreeSet();
        seett=listtt.removeduplicates(list);
        System.out.println(seett);
    }
}
