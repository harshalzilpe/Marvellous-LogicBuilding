#include<iostream>
using namespace std;

double AdditionD(double Arr[], int iSize)
{
    double dSum = 0.0;
    int i = 0;
    
    for(i = 0; i < iSize ; i++)
    {
        dSum = dSum + Arr[i];
    }
    return dSum;
}

int main()
{
    double Brr[] = {10.01,20.20,30.03,40.40};
    double dRet = 0;

    dRet = AdditionD(Brr,4);

    cout<<"Addition of double values are "<<dRet<<".\n";

    return 0;
}