package WeekendAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeSorting {
    TreeMap<String,Integer> toSortBaseOnEmployeeName(HashMap<String,Integer> map){
        TreeMap<String,Integer> tree=new TreeMap<>();
        for(Map.Entry<String ,Integer> entry:map.entrySet()){
            tree.put(entry.getKey(),entry.getValue());
        }
        return tree;
    }

    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("sunil",1000);
        map.put("vinod",232);
        map.put("arun",678);
        map.put("narasimha",89);
        map.put("sahana",898);
       TreeMap<String,Integer> tree=new TreeMap<>();
        EmployeeSorting emp=new EmployeeSorting();
        tree=emp.toSortBaseOnEmployeeName(map);
        System.out.println(tree);
    }
}
