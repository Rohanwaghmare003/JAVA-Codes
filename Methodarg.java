public class Methodarg {
    int s = 0;

    void calSum(int ...x){
        for(int i=0;i<x.length; i++)
        s = s+x[i];
    {
        System.out.println("Sum is \t" +s);
    }

    }

    public static void main(String[] args){

 Methodarg s  = new Methodarg();
 s.calSum(1,2,3);
    }
    
}

