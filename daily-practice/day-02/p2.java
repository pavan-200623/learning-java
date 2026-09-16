
import java.util.Scanner;
public class p2 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp=num;
        int org=num;
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
        int sum=0;
        while(temp>0){
            int r=temp%10;
            int power=1;
            int i=0;
            while(i<count){
                power*=r;
                i++;
            }
            sum+=power;
            temp/=10;
        }
        if(sum==org){
            System.out.println("Given number is armstrong");
        }
        else{
            System.out.println("Given number is not armstrong");
        }

    }
    
}
