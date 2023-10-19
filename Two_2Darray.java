import java.util.Scanner;

public class Two_2Darray {
    public static void main (String [] args) {

        Scanner Xyz = new Scanner(System.in);

        int a[][] = new int[3][3];
        System.out.println("Enter the Elements");

        for(int i=0;i<a.length;i++)
        {

        
        

            for(int j=0;j<a[i].length; j++)
            a[i][j] = Xyz.nextInt();
            {

            }
        }
        System.out.println("Display the matrix");

        for(int i =0; i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.printf("%d\t",a[i][j]);

            }
            System.out.printf("\n");
        }

       


        
    }
    
}
