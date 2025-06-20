package Date12Assignment;

public class SumAlltheValues {
    public static void main(String[] args) {
        Integer sum=0;
        String a[]={ "12","-50","78","112","-119"};
        for(int i=0;i<a.length;i++){
           // System.out.println(a[i]);

        }
        for(String str:a){
           sum=sum+Integer.valueOf(str);
        }
        System.out.println((int)sum);
    }
}
