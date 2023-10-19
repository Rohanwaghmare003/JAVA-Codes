import java.util.Scanner;

public class Fibonnachiseries {

    public static void main (String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = 0,b=1; int c;
        int no = sc.nextInt();
        for(int i =1; i<=no; i++ ){

            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
            System.out.println("The series " +c);

        }
    }
    
}
