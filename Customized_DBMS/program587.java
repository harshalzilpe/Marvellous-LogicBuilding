import java.util.*;

class Matrix
{
    int Arr[][];

    public Matrix(int iRow, int iCol)
    {
        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        System.out.println("Please enter the values : ");

        Scanner sobj = new Scanner(System.in);
        int i = 0, j = 0;

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                Arr[i] [j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        System.out.println("Elements of the matrix are : ");

        int i = 0, j = 0;

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public int Summation()
    {
        int i = 0, j = 0, iSum = 0;

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                iSum = iSum + Arr[i][j];
            }
            System.out.println();
        }
        return iSum;
    }

    public int CountEven()
    {
        int i = 0, j = 0, iCount = 0;

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                if((Arr[i][j] % 2) == 0)
                {
                    iCount++;
                }
            }
            System.out.println();
        }
        return iCount;
    }

    public int SumEven()
    {
        int i = 0, j = 0, iSum = 0;

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                if((Arr[i][j] & 2) == 0)
                {
                    iSum = iSum + Arr[i][j];
                }
            }
            System.out.println();
        }
        return iSum;
    }

    public int Maximun()
    {
        int i = 0, j = 0, iMax = 0;

        iMax = Arr[0][0];

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                if(Arr[i][j] > iMax)
                {
                    iMax = Arr[i][j];
                }
            }
        }
        return iMax;
    }

    public int Minimum()
    {
        int i = 0, j = 0, iMin = 0;

        iMin = Arr[0][0];

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                if(Arr[i][j] < iMin)
                {
                    iMin = Arr[i][j];
                }
            }
        }
        return iMin;
    }

    public void UpdateOdd()
    {
        int i = 0, j = 0;

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                if((Arr[i][j] % 2) != 0)
                {
                    Arr[i][j]++;
                }
            }
        }
    }

    public void MaximumRow()
    {
        int iMax = 0, i = 0, j = 0;


        for(i = 0; i < Arr.length;i++)
        {
            iMax = Arr[i][0];

            for(j = 0; j < Arr[i].length; j++)
            {
                if(Arr[i][j] > iMax)
                {
                    iMax = Arr[i][j];
                }
            }
            System.out.println("Maximum element from row number "+i+" is "+iMax);
        }
    }

    public void MinimumRow()
    {
        int iMin = 0, i = 0, j = 0;

        for(i = 0; i < Arr.length;i++)
        {
            iMin = Arr[i][0];

            for(j = 0; j < Arr[i].length; j++)
            {
                if(Arr[i][j] < iMin)
                {
                    iMin = Arr[i][j];
                }
            }
            System.out.println("Minimum element from row number "+i+" is "+iMin);
        }
    }

    public int SumDiagonal()
    {
        int i = 0, j = 0, iSum = 0;

        if(Arr.length != Arr[0].length)
        {
            System.out.println("Unable to perform the addition of diagonal elements");
            return -1;
        }

        for(i = 0; i < Arr.length;i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                if(i == j)
                {
                    iSum = iSum + Arr[i][j];
                }
            }
        }
        return iSum;
    }

    public int SumBorder()
    {
        int i = 0, j = 0, iSum = 0;

        for(i = 0; i < Arr.length;i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                if((i == 0) || (i == Arr.length-1) || (j == 0) || (j == Arr[i].length-1))
                {
                    iSum = iSum + Arr[i][j];
                }
            }
        }
        return iSum;
    }
}

class program587
{
    public static void main(String Arg[]) 
    {
        int iRow = 0, iCol = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Please enter number of columns : ");
        iCol = sobj.nextInt();
        
        Matrix mobj = new Matrix(iRow,iCol);

        mobj.Accept();
        mobj.Display();

        iRet = mobj.SumBorder();
        System.out.println("Addition of border elements is : "+iRet);
        
    }
}