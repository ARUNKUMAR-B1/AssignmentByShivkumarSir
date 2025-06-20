package Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestClass {
    public static void main(String[] args) {
        //checking regex
        String regex = "^[\\w._]+@[\\w._]+\\.[a-zA-Z]{2,6}";
        String str = "arun@gmail.com";
        System.out.println(str.matches(regex));
        //removing the digits
        String regex1="\\d+";
        String str1="Order123";
        char[] ch=str1.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(Character.toString(ch[i]).matches("\\d")){
                System.out.print(ch[i]);
            }
        }

        //validate mobile number
        String regex2="^[789]\\d{9}";
        String mobNo="7795801404";
        System.out.println(mobNo.matches(regex2));

        //validate date time format
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime loc=LocalDateTime.now();
        System.out.println(loc.format(formatter));

        //sentence starts with capital letters
        String sentence="Hello everyone ,good morning";
        String senRegex="^[A-Z].*";
        System.out.println(sentence.matches(senRegex));

        //print todays date and time
        System.out.println(LocalDateTime.now());

        //String to localdate
        String str2="18/06/2025";











    }

}
