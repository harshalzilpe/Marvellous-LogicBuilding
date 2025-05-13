#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
    int data;
    struct node *next;
}NODE, *PNODE, **PPNODE;

void enqueue(PPNODE head, int no)
{
    PNODE new = NULL;
    PNODE temp = NULL;


    newn = (PNODE)malloc(sizeof(NODE));
    newn->data=no;
    newn->next=NULL;

    if(*head == NULL)
    {
        *head = newn;
    }
    else
    {
        temp = *head;

        while (temp -> next != NULL)
        {
            temp = temp -> next;
        }
        temp -> next = newn;     
    }
}

int dequeue(PPNODE head)
{
    int no = -1;
    PNODE temp = NULL;

    if(*head == NULL)
    {
        printf("Queue is empty\n");
        return -1;
    }
    else if((*head) -> next == NULL)
    {
        no = (*head) -> data;
        free(*head);
        *head = NULL;
    }
    else
    {
        no = (*head) -> data;
        temp = *head;
        *head = (*head) - > next;
        free(temp);
    }
    return no;
}

void Display(PNODE head)
{
    printf("ELements of Queue are : \n");

    while (head != NULL)
    {
        printf("| %d |\n",head->data);
        head = head->next;
    }
    
}

int Count(PNODE head)
{
    printf("ELements of stack are : \n");

    while (head != NULL)
    {
        printf("| %d |\n",head->data);
        head = head->next;
    }
    return iCount;
}

int main()
{
    PNODE first = NULL;
    int iRet = 0;

    enqueue(&first,51);
    enqueue(&first,21);
    enqueue(&first,11);
    
    iRet = dequeue(&first);
    printf("Poped element is : %d\n",iRet);

    iRet = dequeue(&first);
    printf("Poped element is : %d\n",iRet);


    return 0;
}