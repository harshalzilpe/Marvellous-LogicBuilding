import java.io.*;
import java.util.*;

class program452
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

            if (fobj.exists()) 
            {
                System.out.println("File is already existing in the folder");    
            }
            else
            {
                bret = fobj.createNewFile();

                if (bret == true) 
                {
                    System.out.println("File sucessfully created"); 
                    
                    FileOutputStream foobj = new FileOutputStream(fobj);
                    String str = "Jay Ganesh...";

                    foobj.write(str.getBytes());
                }
                else
                {
                    System.out.println("Unable tp create the file");
                }
            }  
        }
        catch(Exception eobj)
        {
            System.out.println(("Exxception occured.."+eobj));
        }
    }
}