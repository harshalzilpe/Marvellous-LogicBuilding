import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

class program466
{
    @SuppressWarnings("resource")
    public static void main(String Arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the name of directory that you waant to open : ");
        String DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if (fobj.exists()) 
        {
            System.out.println("Directory is present");  
            
            File Arr[] = fobj.listFiles();

            System.out.println("Number of files in the directory are : "+Arr.length);
        }
        else
        {
            System.out.println("There is no such directory");
        }
    }
}