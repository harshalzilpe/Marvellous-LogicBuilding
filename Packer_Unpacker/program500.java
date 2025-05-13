import java.io.*;
import java.util.*;

class program500
{
    public static void main(String Arg[])
    {
        int FileSize = 0, iRet = 0, iCount = 0;
        String PackName = null, SHeader = null;
        FileOutputStream foobj = null;
        FileInputStream fiobj = null;
        File fobj = null, fobjx = null;
        Scanner sobj = null;
        
        try
        {
            sobj = new Scanner(System.in);

            System.out.println("-------------------------------------------------------------------------");
            System.out.println("---------------- Marvellous Packer Unpacker CUI Module ------------------");
            System.out.println("-------------------------------------------------------------------------");
            
            System.out.println("---------------------------- UnPacking Activity -------------------------");

            System.out.println("Enter the name of packed file that you want to unpack : ");
            PackName = sobj.nextLine();

            fobj = new File(PackName);

            if (fobj.exists()) 
            {
                fiobj = new FileInputStream(fobj);

                byte Header[] = new byte[100];

                while((iRet = fiobj.read(Header)) != -1)
                {
                    SHeader = new String(Header);
                    SHeader = SHeader.trim();
                    String Arr[] = SHeader.split(" ");

                    System.out.println("File name is : "+Arr[0]);
                    System.out.println("File size is : "+Arr[1]);

                    fobjx = new File(Arr[0]);
                    fobjx.createNewFile();

                    System.out.println("File extected with name : "+Arr[0]);
                    
                    foobj = new FileOutputStream(fobjx);

                    FileSize = Integer.parseInt(Arr[1]);
                    byte Buffer[] = new byte[FileSize];

                    fiobj.read(Buffer);
                    foobj.write(Buffer,0,FileSize);

                    foobj.close();
                    iCount++;
                }
                fiobj.close();

                System.out.println("Number of files succesfully extracted : "+iCount);
            }
            else
            {
                System.out.println("There is no such packed file");
                return;
            }
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("----------- Thank you for using Marvellous Packer-Unpacker --------------");
            System.out.println("-------------------------------------------------------------------------");

        } // End of try
        catch(Exception eobj)
        {
            System.out.println("Exception occured : "+eobj);
        }
    }
}