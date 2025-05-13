import java.util.*;

class program526
{
    public static boolean LinearSearchBidirectional(int Brr[], int iNo)
    {
        boolean bResult = false;
        int iStart = 0, iEnd = 0;

        for (iStart = 0, iEnd = Brr.length-1; iStart <= iEnd ; iStart++, iEnd--)
        {
            if (Brr[iStart] == iNo || Brr[iEnd] == iNo)
            {
                bResult = true;
                break;
            }
        }
        return bResult;
    }
    public static void main(String Arg[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0, iSize = 0, iValue = 0;
        boolean bRet = false;

        System.out.println( "Enter the number of elements :");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the values : ");

        for(i = 0; i < iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Elements of the array are :");

        for(i = 0; i < iSize; i++)
        {
            System.out.println(Arr[i]+"\t");
        }
        System.out.println();

        System.out.println("Enter the elements that you want to search : ");
        iValue = sobj.nextInt();

        bRet = LinearSearchBidirectional(Arr,iValue);

        if (bRet == true) 
        {
            System.out.println("Element is present in the array");    
        }
        else
        {
            System.out.println("There is no such element in the array");
        }
    }
}