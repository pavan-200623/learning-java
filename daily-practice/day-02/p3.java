import java.util.*;
public class p3 { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        while(num!=1 && num!=4){
            int sum=0;
            while(num>0){
                int r=num%10;
                sum+=r*r;
                num/=10;
            }
            num=sum;
        }
        if(num==1){
            System.out.println("Given number is a happy number");
        }
        else{
            System.out.println("Given number is not a happy number");
        }

    }
    
}
