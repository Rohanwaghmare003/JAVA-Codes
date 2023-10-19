public class ObjWithoutref {

    int a;
    int b;

    public void setValue(int c,int d){
        a = c;
        b = d;


    }

    public void Addvalue(){
        System.out.println(a+b);
    }

    public static void main (String[] args)
    {
       
        new ObjWithoutref().setValue(78,54);
        new ObjWithoutref().Addvalue(); // the output is 0 because of not creating reference

        
        
    }
    
}
