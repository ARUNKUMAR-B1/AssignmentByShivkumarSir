package Date12Assignment;

public class StringBuilderClass {
    public static void main(String[] args) {
        String str="onceuponatime";
        StringBuilder sb=new StringBuilder(str);
        //appending the String
        sb.append("ert");
        System.out.println(sb);

        //appending the character
        sb.append("l");
        //you can append any values either may be letter or char or float long values
        //even a single letter or group of character   do not matter
        // and also datataype inssensitive

        //it is used to ad letter at the end by using asscill values
        // give ascio value as input and add letter at the end

        sb.appendCodePoint(65);
        sb.appendCodePoint(66);
        System.out.println(sb);

        //uses of compareTo methos
        String c="kiran";
        String d="arun";
        System.out.println(c.compareTo(d));
        // it comparees k and a only k=107 a=97 diff=10
        //it returns values all integers -positive or negative or zero if they equal
        //used to find magnitude of difference of two strings

        String my="kimjanguao";
        StringBuilder s=new StringBuilder(my);
        s.deleteCharAt(0);
        //delete the  character at particular index
        //in what index you providing delete that letter in that index
        System.out.println(s);
        //if you want to delete the string  from particular character to the particular character
        //ist input is inclusive and end input is exclusive
        s.delete(2,4);
        System.out.println(s);

        //same method is in the zstrings also
        //similarly returms the index of the character
        System.out.println( s.indexOf("a"));

        //we can also get the index of the substring also
        System.out.println(s.indexOf("ao"));
        //it will make the given String as one unit and all other chatracters as another group

        s.insert(2,"r");
        System.out.println(s);
        // we have all the methods for inmserting at specific index
        //depends upon the input the method will call
        //techniocally you can insert number character,string anything
        //for insertion prefer this

        //return the last index of the charcater or string
        //avalibale in both string and stringbuilder
        System.out.println(s.lastIndexOf("o"));

        //it used to find the index using from backward
        //it gives -1 if not found from backward because it serarches from the last index so it do not find and hence it retiurnd -1
        // it it found gives the actual index correspondin the character
        s.append("ruryt");
        System.out.println(s.lastIndexOf("a",6));

// it is used to repeat the String depending upon the count you have given
        //if it is 2 ,it print the String for two times
        //if 3 it prints the String for 3 times
        String repeatt="aru";
        System.out.println( repeatt.repeat(2));

      StringBuilder sbb=new StringBuilder(repeatt);
      // when you want repeat specific substring ,it prints that times and also one time of original String
      sbb.repeat("ru",3);
        System.out.println(sbb);


        //used to reverse the string
        //especially in the case of palindrome checking is this very useful

       String reverse="arun";
       StringBuilder sbbb=new StringBuilder(reverse);
        System.out.println(sbbb.reverse().toString());











    }
}
