// pp.cpp

#include <iostream>
using namespace std;
int main( )
{
    char **p;				//定义指向字符指针数据的指针变量p
    char *name[] = {"BASIC","FORTRAN","C++","Pascal","COBOL"};
    p = name + 2;  			//见图5中p的指向
    cout << *p <<endl;  	//输出name[2]指向的字符串
    cout << **p <<endl;  	//输出name[2]指向的字符串中的第一个字符
}