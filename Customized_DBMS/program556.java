import java.util.*;

class Employee
{
    public int Eno;
    public String Ename;
    public int Eage;
    public String Eaddress;
    public int Esalary;
    public static int Counter;

    static
    {
        Counter = 1;
    }

    public Employee(String B, int C, String D, int E)
    {
        Eno = Counter++;
        Ename = B;
        Eage = C;
        Eaddress = D;
        Esalary = E;
    }

    public void DisplayInformation()
    {
        System.out.println(Eno+"\t "+Ename+"\t "+Eage+"\t "+Eaddress+"\t\t "+Esalary);
    }
}

class MarvellousDBMS
{
    public LinkedList <Employee>lobj;

    public MarvellousDBMS()
    {
        System.out.println("Marvellous DBMS started successfully....");
        lobj = new LinkedList<Employee>();
    }

    protected void finalize()
    {
        System.out.println("Deallocating all resources of Marvellous DBMS...");
        lobj.clear();
        lobj = null;
    }

    // insert into table employee values(1,"Piyush",34,"Pune",11000);
    public void InsertIntoTable(String name, int age, String address, int salary)
    {
        Employee eobj = new Employee(name, age, address, salary);
        lobj.addLast(eobj);
        System.out.println("Record inserted successfully into the table.");
    }

    // select * from Employee;
    public void SelectStarFrom()
    {
        System.out.println("------------------------------------------------");
        System.out.println("No\t Name \t Age \t Address \t Salary ");
        System.out.println("------------------------------------------------");        for(Employee eref : lobj)
        {
            eref.DisplayInformation();
        }
        System.out.println("------------------------------------------------");        
    }

    // Select * from employee where Eno = 3
    public void SelectSpecific(int id)
    {
        for(Employee eref : lobj)
        {
            if (eref.Eno == id) 
            {
                eref.DisplayInformation();
                break;    
            }
        }
    }

    // Select * from employee where Ename = "Amit"
    public void SelectSpecific(String str)
    {
        for(Employee eref : lobj)
        {
            if (eref.Ename == str) 
            {
                eref.DisplayInformation();
                break;    
            }
        }
    }
}

class program556
{
    public static void main(String Arg[]) 
    {
        MarvellousDBMS mobj = new MarvellousDBMS();

        mobj.InsertIntoTable("Sagar", 27, "Pune", 11000);
        mobj.InsertIntoTable("Amit", 28, "Mumbai", 21000);
        mobj.InsertIntoTable("Pooja", 26, "Satara", 51000);
        mobj.InsertIntoTable("Gauri", 28, "Nashik", 18000);
       
        mobj.SelectStarFrom();

        mobj.SelectSpecific(3);

        mobj.SelectSpecific("Amit");

        mobj = null;
        System.gc();
    }
}