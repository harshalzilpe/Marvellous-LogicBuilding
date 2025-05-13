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
            if (str.equals(eref.Ename)) 
            {
                eref.DisplayInformation();
                break;    
            }
        }
    }

    // delete from Employee where Eno = 2
    public void DeleteData(int no)
    {
        int index = 0;
        boolean bFlag = false;

        for(Employee eref : lobj)
        {
            if (eref.Eno == no) 
            {
                bFlag = true;
                break;    
            }

            if(bFlag == false)
            {
                System.out.println("Unable tp remove the element as element is not there in database");
            }
            else
            {
                lobj.remove(index);
            }
        }
    }

    // delete from Employee where Ename = "sagar"
    public void DeleteData(String str)
    {
        int index = 0;
        boolean bFlag = false;

        for(Employee eref : lobj)
        {
            if (str.equals(eref.Ename)) 
            {
                bFlag = true;
                break;    
            }

            if(bFlag == false)
            {
                System.out.println("Unable tp remove the element as element is not there in database");
            }
            else
            {
                lobj.remove(index);
            }
        }
    }

    // select Count(Eno) from Employee
    public void AggregateCount()
    {
        System.out.println("Number of receords in the Employee table : "+Employee.Counter);
    }

    // select Count(Esalary) from Employee
    public void AggregateSum()
    {
        int iSum = 0;

        for(Employee eref : lobj)
        {
            iSum = iSum +eref.Esalary;
        }
        System.out.println("Summation of records in the Employee table : "+iSum);
    }
}

class program562
{
    public static void main(String Arg[]) 
    {
        MarvellousDBMS mobj = new MarvellousDBMS();

        mobj.InsertIntoTable("Sagar", 27, "Pune", 11000);
        mobj.InsertIntoTable("Amit", 28, "Mumbai", 21000);
        mobj.InsertIntoTable("Pooja", 26, "Satara", 51000);
        mobj.InsertIntoTable("Gauri", 28, "Nashik", 18000);
       
        mobj.AggregateCount();
        mobj.AggregateSum();

        mobj = null;
        System.gc();
    }
}