class Student{


    private int id;
    private String name;
    private int age;
      


public void setid(int i)
{ id = i;

}
public int getid()
{ return id;

}

public void setname(String n)
{name = n;

}
public String getname()
{ return name;
}

public void setage(int a)
{
    age = a;
}

public int getage(){

    return age;
}
}
class Addmission{
    Student stud;
    void addNewstudent(Student student)
    {
        stud= student;
    }
    void show()
    {
        System.out.println(stud.getid()+"\t"+stud.getname()+"\t"+stud.getage());
    }
}
public class Creatingrefofoneclasstoother {
public static void main (String [] args){

    Addmission ad = new Addmission();
    Student s = new Student();
    s.setid(234);
   s.setname("Rohan");
    s.setage(23);
    ad.addNewstudent(s);
    ad.show();
}
    
}

    
