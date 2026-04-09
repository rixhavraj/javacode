
public class ab {
    public static void main(String args[]){
        int count =10, num1=0, num2=1;

        System.out.println("Fibo series of" + count  + "is number" );
        int i =1;
        while(i<count){
            System.out.println(num1+ " ");
            int sumOfPrevtwo=num1+num2;
            num1=num2;
            num2=sumOfPrevtwo;
            i++;
        }

    }
}
