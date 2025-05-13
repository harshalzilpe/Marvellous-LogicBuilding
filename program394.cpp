#include<iostream>
using namespace std;

float AdditionF(float no1, float no2)
{
    float Ans = 0.0f;
    Ans = no1 + no2;
    return Ans;
}

int main()
{
    float fRet = 0.0f;
    fRet = AdditionF(11.7f,10.2f);

    cout<<"Addition is : "<<fRet<<"\n";

    return 0;
}