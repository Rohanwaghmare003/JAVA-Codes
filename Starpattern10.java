public class Starpattern10 {
    public static void main(String[] args) {

        // for (int i = 0; i <= 5; i++) {

        //     for (int j = 5; j >= i; j--) {

        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j == 1; j++) {
        //         System.out.print("*");
        //     }

        //     for (int k = 1; k < (i * 2); k++) {
        //         System.out.print(" ");
        //     }

        //     for (int l = 1; l <= i; l++) {
        //         System.out.print(" ");
        //     }

        //     for (int m = 1; m == 1; m++) {

        //         System.out.print("*");

        //     }

        //     System.out.println();

        // }

        for(int i=1; i<=5; i++){

            for(int j =5; j>i; j--){
                System.out.print(" ");
            }

            for (int k=1;k<(i*2); k++){
                if(k>1 && k<(i*2)-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                
               
                
            }
        }

        System.out.println();
    }

}
}
