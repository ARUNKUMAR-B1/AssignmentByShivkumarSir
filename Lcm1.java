import java.util.Scanner;

public class Lcm1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entr the numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int large=(num1>num2)?num1:num2;
        while(true){
            if(large%num1==0 && large%num2==0)
            break;
            else{
                large++;
            }
        }
        System.out.print(large);
    
}}
