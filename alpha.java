import java.util.*;

class fabonacci {
    void printFibonacci() {
        int count = 10, num1 = 0, num2 = 1;
        System.out.println("Fibo series of " + count + " is number");
        int i = 1;
        while(i<count){
            System.out.println(num1 + " ");
            int sumOfPrevtwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevtwo;
            i++;
        }
    }
}
class calci{
    void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double var2 = sc.nextDouble();
        System.out.println("Enter the seecond number: ");
        double var4 = sc.nextDouble();
        double var6 = var2 + var4;
        System.out.println(var6);
        if (var6 % (double)2.0F == (double)0.0F) {
         System.out.println(var6 + " is a even number");
      } else {
         System.out.println(var6 + " odd");
      }
      sc.close();
    }
}

public class alpha {
   public static void main(String[] args) {
      fabonacci fib = new fabonacci();
      fib.printFibonacci();
      System.out.println("now add two numbers");
      calci c=new calci();
      c.add();
   }
}