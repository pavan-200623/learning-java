
import java.util.*;
public class p4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        while(num%2==0){
            num/=2;
        }
        while(num%3==0){
            num/=3;
        }
        while(num%5==0){
            num/=5;
        }
        if(num==1){
            System.out.println("Given number is ugly number");
        }
        else{
            System.out.println("Given number is not ugly number");
        }



    }
    
}
