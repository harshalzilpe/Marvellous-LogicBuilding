import java.io.*;
import java.util.*;

class program458
{
    public static void main(String Arg[]) throws Exception
    {
        try
        {
            boolean bret = false;
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the file name that you want to open : ");
            String name = sobj.nextLine();

            File fobj = new File(name);

            if (fobj.exists()) 
            {
                int iRet = 0 ;
                FileInputStream fiobj = new FileInputStream(fobj);
                
                byte arr[] = new byte[20];

                iRet = fiobj.read(arr);
                String str = new String(arr);
                System.out.println("Data from file is : "+str);
                System.out.println("Return value of read os : "+iRet);
            }
            else
            {
                System.out.println("Thre is no such file"); 
            }
        }
        catch(Exception eobj)
        {
            System.out.println(("Exxception occured.."+eobj));
        }
    }
}