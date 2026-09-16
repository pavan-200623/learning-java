import java.util.Scanner;
public class Day_2 {

    public static void main(String[] args){
        Scanner  s = new Scanner(System.in);
        System.out.println("enter the nuber:");
        int n=s.nextInt();
    int count=0;
    for(int i=1;i<=n;i++){
        if(n%i==0){
            count++;}
    }
    if (count==2){
        System.out.println("given number is prime");
    }
    else{
        System.out.println("given number is not prime");
    }
}
    }
    

