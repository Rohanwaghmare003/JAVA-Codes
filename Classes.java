public class Classes {
    private int id;
    private String name;
    private long sal;

    public void setDetails(String n,int i, long s)
    {

        name = n;
        id = i;
        sal = s;
    }

    public void showDetails()
    {
        System.out.println(name+"\t"+id+"\t"+sal );
    }

    public static void main(String[] args) {

        Classes emp = new Classes();

        emp.setDetails("Rohan",123,60000);
        emp.showDetails();
        emp.setDetails("r",12,2345 );
        emp.showDetails();


        
      
        
    }

}