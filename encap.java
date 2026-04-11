import java.util.*;
class account{
    private int balance;
    //setter fn
 public void setBalance(int balance){
    if(balance>=0){
    this.balance=balance;
    }
 }
 //getter fn
 public int getBalance(){
    return balance;
 }

 void pass(){
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password: ");
        int pass1 = sc.nextInt();
         int pass=1001;
        if(pass1==pass){
            System.out.println("Enter the amount: ");
            int balance = sc.nextInt();
        System.out.println("Your account balance: "+"$"+balance);
        }else{
            System.out.println("Wrong password");
        }
        sc.close();
 }
}

public class encap {
    public static void main(String [] agrs){
       account ac1=new account();
       ac1.pass();
    }
}
