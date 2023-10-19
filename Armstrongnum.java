import java.util.Scanner;

public class Armstrongnum{

    public static void main (String[]args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr the Numbers");

        int sum =0;
        int no = sc.nextInt();
        

        for(int i = 0; i>=no; i++){

            sum = sum + no %10;
           
            System.out.println(sum);
        }
    }
    
}
