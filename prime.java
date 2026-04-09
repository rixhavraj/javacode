import java.util.*;

public class prime{
    public static void main(String args[]){
        Scanner ar = new Scanner(System.in);
        System.out.println("Enter the number to check prime: ");
        int n = ar.nextInt();
        ar.close();
        boolean isprime = true;
        if(n<=1){
            isprime = false;
        }else{
            for(int i=2; i<=n/2; i++){
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }
        }
        if(isprime){
            System.out.println("prime");
        }else{
            System.out.println("not a prime");
        }
    }
}