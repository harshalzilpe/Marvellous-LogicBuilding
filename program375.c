#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
    int data;
    struct node *next;
}NODE, *PNODE, **PPNODE;

void push(PPNODE head, int no)
{
    PNODE new = NULL;

    newn = (PNODE)malloc(sizeof(NODE));
    newn->data=no;
    newn->next=NULL;

    if(*head == NULL)
    {
        *head = newn;
    }
    else
    {
        newn -> next = *head;
        *head = newn;
    }
}

int pop(PPNODE head)
{
    int no = -1;
    PNODE temp = NULL;

    if(*head == NULL)
    {
        printf("Stack is empty\n");
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
{}

int Count(PNODE head)
{}

int main()
{
    PNODE first = NULL;
    int iRet = 0;

    push(&first,51);
    push(&first,21);
    push(&first,11);
    
    iRet = pop(&first);
    printf("Poped element is : %d\n",iRet);

    iRet = pop(&first);
    printf("Poped element is : %d\n",iRet);


    return 0;
}