import java.util.Scanner;

public class Leap1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entr the year");
        int year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println("leapyear");
        }
        else{
            System.out.println("not a leapyear");
        }
    
}
}
