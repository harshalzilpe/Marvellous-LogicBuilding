#include<iostream>
using namespace std;

double AdditionD(double no1, double no2)
{
    double Ans = 0.0;
    Ans = no1 + no2;
    return Ans;
}

int main()
{
    double dRet = 0.0;
    dRet = AdditionD(11.7,10.2);

    cout<<"Addition is : "<<dRet<<"\n";

    return 0;
}