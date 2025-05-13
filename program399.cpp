#include<iostream>
using namespace std;

float AdditionF(float Arr[], int iSize)
{
    float fSum = 0.0f;
    int i = 0;
    
    for(i = 0; i < iSize ; i++)
    {
        fSum = fSum + Arr[i];
    }
    return fSum;
}

int main()
{
    float Brr[] = {10.01f,20.20f,30.03f,40.40f};
    float fRet = 0;

    fRet = AdditionF(Brr,4);

    cout<<"Addition of float values is "<<fRet<<".\n";

    return 0;
}