import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class Iterators{
    public static void main(String[] args) {
        List<Integer> values=new ArrayList<>();
        List<Integer>kalues=new ArrayList<>() ;
        kalues.add(1);
        kalues.add(2);
        values.addAll(0,kalues);
        for(int k:values){
            System.out.println(k);
        }

        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        System.out.println(values.isEmpty());
        System.out.println(values.size());
        System.out.println(values.contains(1));
        Object[] Object =values.toArray();
        Iterator<Integer>iteratedvvalue=(values.iterator());
        for(int k:values){

        }
        Iterator<Integer>iteratedvalue=values.iterator();

       while(iteratedvalue.hasNext()){
           int val=iteratedvalue.next();

           if(val==3)
           {
               iteratedvalue.remove();
           }
           System.out.println(val);



        }
       for(int k:values){
           System.out.println(k);
           Object Collection;
       }
    }
}