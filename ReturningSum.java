import java.util.HashMap;
import java.util.Map;

public class ReturningSum {
    Map<Integer, Integer> map = new HashMap<>();

    Map<Integer, Integer> pairsOfInteger(int sum, int[] givenArray) {
        for (int i = 0; i < givenArray.length-1; i++) {
            if ( givenArray[i] + givenArray[i + 1] == sum ) {
                map.put(givenArray[i], givenArray[i + 1]);
            }

        }
        return map;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> neww=new HashMap<>();
        ReturningSum returningSum=new ReturningSum();
        int [] a={1,5,7,-1,5};
        neww=returningSum.pairsOfInteger(6,a);
        for(Map.Entry<Integer,Integer>entry: neww.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}