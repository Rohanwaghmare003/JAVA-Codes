import java.util.Scanner;

public class ReverseString {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("enter the String");

       String Rev_Str = " ";

       String Str = sc.nextLine();

       for(int i=Str.length()-1; i>=0; i--){

        
        Rev_Str = Rev_Str + Str.charAt(i);
        
       }
       System.out.println("The Reversed String is"+Rev_Str);


        
    }
    
}
