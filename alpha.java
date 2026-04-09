import java.util.Scanner;
public class alpha {
    public static void main(String agrs[]){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter the seecond number: ");
        double b = sc.nextDouble();
        double c = a+b;
        System.out.println(c);
    
          if(c%2==0){
            System.out.println(c+" is a even number");
        }else{
            System.out.println(c+" odd");
        }
        sc.close();
    }
}
