
import java.io.*;
import java.util.*;

class program448
{
    public static void main(String Arg[]) throws Exception
    {
        try
        {
            boolean bret = false;
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the file name that you want to create : ");
            String name = sobj.nextLine();

            File fobj = new File(name);

            bret = fobj.createNewFile();

            if (bret == true) 
            {
                System.out.println("File sucessfully created");    
            }
            else
            {
                System.out.println("Unable tp create the file");
            }
        }
        catch(Exception eobj)
        {
            System.out.println(("Exxception occured.."+eobj));
        }
    }
}