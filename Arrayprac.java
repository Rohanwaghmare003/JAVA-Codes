import java.util.Scanner;

public class Arrayprac {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
       
        int a[] = new int[5];

        System.out.println("Enter the Elements in array");
        for(int i = 0; i<a.length; i++)
        {

             a[i] = sc.nextInt();
            
        }
        System.out.println("The elements in array are");
        for(int i=0; i<a.length; i++)
        {

            System.out.println(a[i]);
        }



        }
    }     
    

