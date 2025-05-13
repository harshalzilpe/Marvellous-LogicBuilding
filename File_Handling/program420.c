#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
    int fd = 0; // fd = file descriptor
    char Name[30];

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

        write(fd,"Jay Ganesh",10);
        
        close(fd);
    }

    return 0;
}