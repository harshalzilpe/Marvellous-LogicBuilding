#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
    int fd = 0; // fd = file descriptor
    char Name[30];
    int iRet = 0;

    printf("Please enter the file name that you want to open : \n");
    scanf("%[^'\n']s",Name);

    fd = open(Name,O_RDWR);

    if(fd == -1)
    {
        printf("Unable to open file\n");
    }
    else
    {
        printf("File successfully opened with FD %d\n",fd);

        iRet = write(fd,"Jay Ganesh",10);
        printf("%d bytes gets sucessfully written into the file.\n", iRet);
        
        close(fd);
    }

    return 0;
}