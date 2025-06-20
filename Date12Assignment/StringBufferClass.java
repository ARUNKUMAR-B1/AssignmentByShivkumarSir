package Date12Assignment;

public class StringBufferClass {
    public static void main(String[] args) {
        String str="Hosahalli";
        StringBuffer s=new StringBuffer(str);

        //get the index of
        System.out.println( s.indexOf("a"));
        //get the index of this
        System.out.println(s.indexOf("ll"));

        String repeatt="kir";
        System.out.println( repeatt.repeat(2));
    }
}
