class Classconverttoupper
{
    char ch[];
    void setCharArray(char c[]){
        ch = c;
    }
    void convertToUpper(){
        for(int i=0; i<ch.length;i++)
        {
            if(ch[i]>='a' && ch[i]<='z')
            {
                int c = (int)ch[i]-32;
                ch[i]=(char)c;
            }
        }
        System.out.println("after a conversion is");
        for(int i=0;i<ch.length;i++)
        {
            System.out.println("the valuue of i is"+i+"\tThe value of ch is"+ch[i]);
        }
    }
}




public class Classconverttoupperprac {



    public static void main (String []args)
    {
        Classconverttoupper cp = new Classconverttoupper();
        char ch[] = new char[]{'a','c','d'};
        cp.setCharArray(ch);
        cp.convertToUpper();
    
}
}
