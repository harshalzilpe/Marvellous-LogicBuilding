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
        newn->=*head;
        *head = newn;
    }
}

int pop(PPNODE head)
{}

void Display(PNODE head)
{}

int Count(PNODE head)
{}

int main()
{
    PNODE first = NULL;

    push(&first,51);
    push(&first,21);
    push(&first,11);
    

    return 0;
}