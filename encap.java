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
}

public class encap {
    public static void main(String [] agrs){
        account ac1 = new account();
        ac1.setBalance(100);
        int balance=ac1.getBalance();
        System.out.println("Your account balance: "+"$"+balance);
    }
}
