#include<iostream>
using namespace std;

typedef struct node
{
    int data;
    struct node *next;
}NODE, *PNODE;

class stack
{
    public:
        PNODE head;
        int iCount;

        stack()
        {
            head = NULL;
            iCount = 0;
        }

        void push(int no)
        {
            PNODE newn = NULL;
            newn = new NODE;
            newn -> data = no;
            newn -> next = NULL;

            if (head == NULL)
            {
                head = newn;
            }
            else
            {
                newn->next=head;
                head = neewn;
            }
            iCount++;   
        }

        void pop()
        {
            int no = -1;
            PNODE temp = NULL;

            if (head == NULL)
            {
                cout<<"Stack is empty\n";
                return -1;
            }
            else if(head->next == NULL)
            {
                no = head -> data;
                delete head;
                head = NULL;
            }
            else
            {
                no = head -> data;
                temp = head;
                head = head->next;
                delete temp;
            }
            iCount--;
            return no;  
        }

        void Display()
        {
            cout<<"Elements of stack are : \n";
            PNODE temp = head;

            while (temp != NULL)
            {
                cout<<"| "<<temp->data<<" |\n";
                temp = temp -> next;
            }
            
        }

        int Count()
        {
            return iCount;
        }
}

int main()
{
    stack sobj;
    int iRet = 0;
    
    sobj.push(101);
    sobj.push(51);
    sobj.push(21);
    sobj.push(11);

    sobj.Display();
    iRet = sobj.Count();
    cout<<"Numbers of elements are : "<<iRet<<"\n";

    iRet = sobj.pop();
    cout<<"Poped elements is : "<<iRet<<"\n";

    iRet = sobj.pop();
    cout<<"Poped elements is : "<<iRet<<"\n";

    sobj.Display();
    iRet = sobj.Count();
    cout<<"Numbers of elements are : "<<iRet<<"\n";

    return 0;
}