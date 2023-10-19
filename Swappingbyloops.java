import java.util.Scanner;

public class Swappingbyloops {
    public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);
        
        int a,b;

        System.out.println("Enter your two values");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Before Swapping\n");
        System.out.println("The value of A is\n"+a+"Value of B is"+b);
        a = a+b;
        b = b-a;
        a = a-b;
        System.out.println("After Swapping\n");
        System.out.println("The value of A is\n"+a+"Value of B is"+b); 
        
    }
    
}
