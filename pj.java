import java.util.*;

public class pj {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        sc.close();
        System.out.println("Original name: "+ name);
        System.out.println("LowerCase: "+name.toLowerCase());
        System.out.println("Uppercase: "+name.toUpperCase());
        System.out.println("Lenght of the name: "+name.length());
    }
}
