import java.util.Scanner;

public class Reversenumber {
    //palindrome program divisibility rule is used

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to reverse");
    int rem = 0; int rev = 0;
    int no = sc.nextInt();
    while(no!=0){
        rem = no%10;
        rev = rev*10 + rem;
        no = no/10;
        System.out.println("The reversed number is"+rev);
    }
}
    
}
