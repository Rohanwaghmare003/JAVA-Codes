public class Starpattern8 {

public static void main(String[]args){
//way1

    // for (int i = 1; i<=4; i++){

    //     for(int j=1; j<=i; j++){
    //         System.out.print(" ");
            
    //     }

    //     for(int k=4; k>=i; k-- ){

    //         System.out.print("*");
    //     }

    //         for(int l=3; l>=i; l--){

    //             System.out.print("*");
    //         }
        
    //     System.out.println();
    // }


// way 2
    // for(int i = 1; i<=4; i++){

    //     for(int j = 1; j<=i;j++){

    //         System.out.print(" ");
    //     }

    //     for(int k =9;k>(i*2); k--){

    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    for(int i =4; i>=1; i--){


        for(int j=4; j>i; j--){

            System.out.print(" ");
        }

        for(int k=1;k<(i*2); k++){

            System.out.print("*");
        }
        System.out.println();
    }
    




    }
}
    

