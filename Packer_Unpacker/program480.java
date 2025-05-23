import java.io.*;
import java.util.*;

class program480
{
    public static void main(String Arg[]) throws Exception
    {
        String DirName = "", PackName = "", Header = "";
        FileOutputStream fopackobj = null;
        FileInputStream fiobj = null;

        Scanner sobj = new Scanner(System.in);
        File Packobj = new File(PackName);
        boolean bret = false;

        int i = 0, j = 0, iRet = 0;

        byte Buffer[] = new byte[1024];

        System.out.println("---------------------------------------------------------------------");
        System.out.println("-------------- Marvellous Packer Unpacker CUI Module ----------------");
        System.out.println("---------------------------------------------------------------------");

        System.out.println("---------------------------- Packing Activity -----------------------");

        System.out.println("Enter the name of directory that you want to open for packing : ");

        System.out.println("Enter the name of packed file that you want to create : ");
        PackName = sobj.nextLine();

        bret = Packobj.createNewFile();
        if(bret == true)
        {
            System.out.println("Packed file gets succesfully created with the name : "+PackName);
        }
        else
        {
            System.out.println("Unable to proceed as pack file is not created");
            return;
        }

        fopackobj = new FileOutputStream(Packobj);

        File fobj = new File(DirName);

        if(fobj.exists())
        {
            System.out.println("Directory is succesfully opened");

            File Arr[] = fobj.listFiles();

            System.out.println("Total number of files in the Directory are : "+Arr.length);

            for(i = 0; i < Arr.length; i++)
            {
                Header = Arr[i].getName()+" "+Arr[i].length();
                
                for(j = Header.length(); j < 100; j++)
                {
                    Header = Header + " ";
                }

                // Header Writing
                fopackobj.write(Header.getBytes(),0,100);

                fiobj = new FileInputStream(Arr[i]);

                // File data writing
                while ((iRet = fiobj.read(Buffer)) != -1) 
                {
                    fopackobj.write(Buffer, 0, iRet);    
                }
                Header = "";
            }
        }
        else
        {
            System.out.println("There is no such director");
        }
        System.out.println("---------------------------------------------------------------------");

    }
}