import java.util.Scanner;

public class Largest {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entr the Numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3){
            System.err.println("num1 is greater");
        }
        else if(num2>num1 && num2>num3){
            System.err.println("num2 is greater");
        }
        else{
            System.err.println("num3 is greater");
        }

}
}