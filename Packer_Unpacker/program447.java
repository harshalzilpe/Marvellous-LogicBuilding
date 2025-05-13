package Packer_Unpacker;

import java.io.*;

class program447
{
    public static void main(String Arg[]) throws Exception
    {
        try
        {
            boolean bret = false;

            File fobj = new File("Demo.txt");

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