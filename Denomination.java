import java.util.HashMap;
import java.util.Map;

public class Denomination {
    Map<Integer,Integer> result=new HashMap<>();

    public Map<Integer,Integer> toCountNotes(int amount,int cashPaid) {
        int rem = cashPaid - amount;
        int[] denom = {1000, 500, 200, 100, 50, 20, 10, 5, 3, 2, 1};
        while (rem > 0){
            for (int i = 0; i < denom.length; i++) {
                if (rem >= denom[i]) {
                    rem = rem - denom[i];
                    result.put(denom[i], 1);
                }
            }
    }
        return result;
    }

    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        Denomination denomination=new Denomination();
        map=denomination.toCountNotes(137,1000);
        for(Map.Entry<Integer,Integer>entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

}
