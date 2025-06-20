package Date12Assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        //checking the existence of the character
        //to get true,eithe one character present ,if combination of  characters are present it wont work for the combination of characters
        String s="a";
        String regex="[abc]";
        System.out.println(s.matches(regex));

        //here also we get false because it extracts each letter from regex and compare with the String ,in all the case it gets more chatracter than the regex so it sends falls
        String str="arunrrrrrruuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaaaaaaaaaaaaaaaaa";
        String regex1="[arun]+";
        System.out.println(str.matches(regex1));

        //negated character class
        String k="k";
        String r1="[^abc]";
        System.out.println(k.matches(r1));
        //except the abc ,extract eachcharacter and compare with the string k
        //it compares one letter in regex and string k ,it is true iff one letter and except abc
        String k1="a";
        String r2="[a-zA-Z]";
        System.out.println(k1.matches(r2));

        //nested range ,u can define tworanges inside of it
        //[] it is used compare each letter inside the this
        String k2="o";
        String r3="[a-dm-p]";
        System.out.println(k2.matches(r3));

        // usage of X? it either check that letter exists at once or zero existance
        String colour="colour";
        String color="color";
        String r4="colou?r";
        System.out.println(color.matches(r4));
        System.out.println(colour.matches(r4));

        // X+ checks for one more time \
        String l="arunarun";
        String r5="[arun]+";
        System.out.println(l.matches(r5));
        //[arun]+ is a huge ,it makes all the combinations from that word which includes a,r,u,n ,,ar,ru,un,na,aru,run,etc


        //X*
        //0*123--it matches for 0123,00123,0000123,000000000123,it does not care how manyt zeroes are there
        String ll="000123";
        String lll="000000000000000000000000000000123";
        String llll="1234";
        String r6="0*1234";
        System.out.println(ll.matches(r6));
        System.out.println(lll.matches(r6));
        System.out.println(llll.matches(r6));

        //a{3} it checks how many times the letters is repating in conmsecutive manner
        // it true only for aaa only for all other cases it gives false

        String m="aaa";
        String mm="bbaaa";
        String mmm="baaa";
        String r7="a{3}";

        System.out.println(m.matches(r7));
        System.out.println(mm.matches(r7));
        System.out.println(mmm.matches(r7));
//[abc]? it matches single character =""."a","b","c"
//[abc]+=a,b,c,ab,bc,ca,abc,bca,acb.aabbcc.ccc,aaa,bbb  //these three chaacters any nuber any order it doesnot care
//[abc]*-aaaaaaaaa,bb,ccc,abc,aaaaaaaaaaaaaabbccccccccc,all combinations of these three latters and any orfder
        String n="abcccbbbbbbbbbbbbbbbbbbcccccccccccccc";
        String r8="[abc]+";
        System.out.println(n.matches(r8));


        String b="aaaaaaaaaaaaaaaaaaaaaabccccccccccccc123";
        String r9="[abc]*123";
        System.out.println(b.matches(r9));


        // digits comparing
        //limit number of digits-\d{3}-limit digit to three
        //(123)456-7890==="(\d{3})\d{3}-\d{4} ";
        //12/25/2023==="\d{2}/\d{2}/\d{4}"



      //\D is non digit code --it distinguish which are digits and which are not digits
      // best for extracting digits using non digia separator
      //removing non digit character from the string
        //"Phone: (123) 456-7890" => \D+ => "1234567890"
            String bc="Phone: (123) 456-7890";
            String r10="\\D+";
        System.out.println(bc.replaceAll(r10,""));
        //validating alphanumeric
        //non digits followed by the digits
        //\D+\d+
        String al="xyz123";
        String r11="^\\D+\\d+$";
        System.out.println(al.matches(r11));

        // splitting Strings at the non digit separator
        // used tyo extract date  from the String --year ,month ,day separately

        String bb="2023/12/25";
        // regex pattern for this="\d{4}/\d{2}/\d{2}"
       String a[]=bb.split("\\D");
       for(String strr:a){
           System.out.println(strr);
       }

    // use case of \s
        // it can be used to split the  words based on the space
        // for one spoce use  "\\s"
        // for multiple spaces use "\\s+"
       String v="java is a good                       language to learn ";
       String bcd[]=v.split("\\s+");
       for(String ss:bcd){
           System.out.println(ss);
       }

       // non space characters comparison
        String s1="arun";
       String s2="a  r     u    n";
        System.out.println(s1.equals(s2.replaceAll("\\s","")));


///   any word character
        // \w -- a-z,0-9,_,A-z
        // it matches for the given string should be contain aplhabets ,numbers and  underscore

        // check name starts word shoud contain letters ,numbers ,and underscore and length should be 5 and maximum length is 12
            //  "^\w{5,12}
        String ss="Arun_123@";
        String rr1="^\\w{5,12}";
        System.out.println(ss.matches(rr1));

        //extract all words from the sentence
      // basic things to remeber the for using the pattern matcher
        //pass the regex inside the pattern.compile();
        //pattern.maatches gives the matcher object
        // matcher.find() check for any words represent===it gives true or false
        //if true it will print the word using matcher.group()

        String sen="Hello_world! Java123 is awesome.";
        System.out.println(Pattern.matches("\\w+",sen));
        Pattern pattern=Pattern.compile("\\w+");
        Matcher matcher=pattern.matcher(sen);
        while(matcher.find()){
            System.out.println(matcher.group());

        }
        // email validation
        //"arun_123@gmail.com";==="\\w@gmail.com"
//        String email="arun_123@gmail.com";
//        String rrr3="\\w+@gmail.com";
//        if(email.matches(rrr3)){
//            System.out.println("valid email");
//        }
//        else{
//            System.out.println("invalid email");
//        }

        //arun@gmail.com===>"\\w+@\\w+.\\w{3}$";
        String email2="arun@gmail.com";
        String rw="\\w+@\\w{5}.\\w{3}$";
        if(email2.matches(rw)){
            System.out.println("string is valid");
        }
        else{
            System.out.println("String is invalid");
        }


//arun_kumar@outlook.com==>"\\w+@\\w{7}.\\w{3}"

//word boundary
        // match the given word with the regex if it found just print this
        String sent="I have a cat, not a catalog";
        String rt2="\\bcat\\b";
        Pattern patternn=Pattern.compile(rt2);
        Matcher matcherr=patternn.matcher(sent);
        if(matcherr.find()){
            System.out.println(matcherr.group());
        }























    }
}
