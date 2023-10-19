public class Star_Patternthree {
   
    
    public static void main (String[]args){

        // for(int i =1; i<=4;i++){

        //     for(int j =3; j>=i; j--) //for spacing
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

// reverse spacing
        for(int i =1; i<=4; i++){

        for(int j = 1; j<=i; j++){
            System.out.print(" ");

        }

        for(int k = 3; k>=i; k--){
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
