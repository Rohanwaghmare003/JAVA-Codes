public class Pojoclass {

    private String Name;
    private int id;
    private int sal;

    public void setName(String n){
        Name = n;
    }

    public String getName()
    {
        return Name;
    }
    public void setid(int i)
    { id = i;

    }

    public int getid()
    {
        return id;
    }

    public void setsal(int s)
    { sal = s;

    }


    public int getsal()
    { return sal;

    }

    public class Employee
    {
    
    }

    public static void main(String[] args)
    {
    Pojoclass poj = new Pojoclass();
    poj.setName("Rohan");
    poj.setid(1234);
    poj.setsal(500000);
    
    System.out.println("The name is" +poj.getName() + "\tThe id is" +poj.getid() + "\tThe salary is" +poj.getsal());
    

    
    
}
}
