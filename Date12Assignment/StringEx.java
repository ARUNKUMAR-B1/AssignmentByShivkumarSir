package Date12Assignment;

public class StringEx {
    public static void main(String[] args) {
        String str="arunkumarbangalore";
        //finding length
        System.out.println(str.length());
        //extracting the character
        System.out.println(str.charAt(0));
        //substring from beginning to ending
        System.out.println(str.substring(8));
        //substring from begin index and endindex-1
        System.out.println(str.substring(8,11));
        //equals
        System.out.println(str.equals("arunkumarbangalore"));
        //we can use index of for getting the index of the character as weella s the index ofthe substring
        // returns the index pf the r
        System.out.println(str.indexOf('r'));
        //returns the index of the substring
        System.out.println(str.indexOf("ban"));
        //priont the last inndex of the occurence
        System.out.println(str.lastIndexOf('o'));
        //starts with  gives true or false
        System.out.println(str.startsWith("aru"));
        //check the given string ends with the provided input
        System.out.println(str.endsWith("ore"));
        //changing the case
        System.out.println(str.toUpperCase());
        //to lower case
        System.out.println(str.toLowerCase());
        //trim is used to trim leading and trailing spaces
        System.out.println(str.trim());
        // replacing the charactre using the index
        System.out.println(str.replace('a','b'));
        System.out.println(str.replace('b','a'));
        //check whether the given input is present either the character or the sequence of characters which suimulate the string\
        System.out.println(str.contains("aru"));
        //check indvidual character
        System.out.println(str.contains("a"));

        //checking empty or not
        String empty="";
        System.out.println(empty.isEmpty());
        //splitting the String based on the regex you provided
        String splitt="hey ,how are you";
        String [] newSplitted=splitt.split(" ");
        for(String extr:newSplitted){
            System.out.println(extr);
        }

        //concat is usd to ad the String
        //here you can add character to the string itself
        //because implicit typexcasting happens internally

        String concatt="";
        String k="bangalore";
        for(char c:k.toCharArray()){
            concatt=concatt+c;
        }
        System.out.println(concatt);
        //String concatation
        String str11="arun";
        String str2="kiran";
        System.out.println(str11+str2);
        //output:arunkiran
        String str3="1234";
        String str4="raju";
        System.out.println(str3+str4);
        //output:1234raju

        //String.valueOf() is poppular method used in java apllications is used to convert any datataype to the string
        Long l=122l;
        String output=String.valueOf(l);
        System.out.println(output);
        //output="122"
        //similarly we can do this for any datatype


    }
}
