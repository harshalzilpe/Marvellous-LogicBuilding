class node
{
    public int data;
    public node next;
    public node prev;

    public node(int x)
    {
        data = x;
        next = null;
        prev = null;
    }
}

class DoublyCL
{
    public node head;
    public node tail;
    public int iCount;

    public DoublyCL()
    {
        head = null;
        tail = null;
        iCount = 0;
    }

    public void InsertFirst(int no)
    {
        node newn = new node(no);

        if ((head == null) && (tail == null))
        {
            head = newn;
            tail = newn;
        }
        else
        {
            newn.next = head;
            head.prev = newn;
            head = newn;
        }

        tail.next = head;
        head.prev = tail;

        iCount++;
    }

    public void InsertLast(int no)
    {
        node newn = new node(no);

        if ((head == null) && (tail == null))
        {
            head = newn;
            tail = newn;
        }
        else
        {
            tail.next = newn;
            newn.prev = tail;
            tail = tail.next;
        }
        tail.next = head;
        head.prev = tail;

        iCount++;
    }

    public void Display()
    {
        node temp = head;
        if (head != null && tail != null) 
        {
            System.out.println("Elements of the linkedList are : ");

            do
            {
                System.out.print("| "+temp.data+"| -> ");
                temp = temp.next;
            }while(temp != tail.next);
            System.out.println(" null");
        }
    }

    public int Count()
    {
        return iCount;
    }

    public void DeleteFirst()
    {
        if ((head == null) && (tail == null)) 
        {
            return;
        }
        else if(head == tail)
        {
            head = null;
            tail = null;
        }
        else
        {
            head = head.next;

            tail.next = head;
            head.prev = tail;
        }
        System.gc();
        iCount--;
    }

    public void DeleteLast()
    {
        if ((head == null) && (tail == null)) 
        {
            return;
        }
        else if(head == tail)
        {
            head = null;
            tail = null;
        }
        else
        {
            tail = tail.prev;

            tail.next = head;
            head.prev = tail;
        }
        System.gc();
        iCount--;
    }

    public void DeleteAtPos(int ipos)
    {
        if((ipos < 1) || (ipos > iCount))
        {
            System.out.println("Invalid position");
            return;
        }

        if (ipos == 1) 
        {
            DeleteFirst();
        }
        else if (ipos == iCount) 
        {
            DeleteLast();
        }
        else
        {
            int i = 0;
            node temp = head;

            for(i = 1; i < ipos-1; i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            temp.next.prev = head;
            iCount--;
        }
    }
}

class program521
{
    public static void main(String Arg[])
    {
        DoublyCL dobj = new DoublyCL();
        int iRet = 0; 

        dobj.InsertFirst(51);
        dobj.InsertFirst(21);
        dobj.InsertFirst(11);
        
        dobj.InsertLast(101);
        dobj.InsertLast(111);
        dobj.InsertLast(121);
     
        dobj.InsertAtPos(75, 4);
        
        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number of elements in the linkedlist are "+iRet);

        
    }
}