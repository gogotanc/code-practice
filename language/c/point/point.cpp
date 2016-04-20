#include <iostream>
using namespace std;
int main()
{
    int iv;                         //1
    int iv2 = 1024;                 //2
    int iv3 = 999;                  //3
    //int &reiv;                      //4
    int &reiv2 = iv;                //5
    int &reiv3 = iv;                //6
    int *pi;                        //7
    //int *pi2 = 5;                    //8
    pi = &iv3;                      //9
    //const double di;                //10
    const double maxWage = 10.0;    //11
    const double minWage = 0.5;     
    const double *pc = &maxWage;     //12

    cout << pi;
    return 0;
}