import java.util.*;

public class TestCal {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("bat", "ball", "cat", "apple", "to", "dog");
        Map<Integer,List<String>> map=new HashMap<>();
        for(String str:list){
            if(map.containsKey(str.length())){
                List<String> li=new ArrayList<>();
                li=map.get(str.length());
                li.add(str);
                map.put(str.length(),li);

            }
            else{
                List<String> ll=new ArrayList<>();
                ll.add(str);
                map.put(str.length(),ll);

            }
        }
        for(Map.Entry<Integer,List<String>>entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }
}
