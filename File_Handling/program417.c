#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
    int fd = 0; // fd = file descriptor
    char Name[30];

    printf("Please enter the file name that you want to create : \n");
    scanf("%[^'\n']s",Name);

    fd = creat(Name,0777);

    if(fd == -1)
    {
        printf("Unable to create file\n");
    }
    else
    {
        printf("File successfully created with FD %d\n",fd);
    }

    return 0;
}