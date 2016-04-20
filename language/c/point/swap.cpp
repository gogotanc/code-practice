#include <iostream>
using namespace std;

void swap(int a, int b)
{
	int temp;
	temp = a;
	a = b;
	b = temp;
}

void swap1(int *a, int *b)
{
	int temp;
	temp = *a;
	*a = *b;
	*b = temp;
}

void swap2(int &a, int &b)
{
	int temp;
	temp = a;
	a = b;
	b = temp;
}

int main()
{
	int a = 1, b = 2;
	swap(a, b);
	cout << a << " " << b << endl;
	swap1(&a, &b);
	cout << a << " " << b << endl;
	swap2(a, b);
	cout << a << " " << b << endl;
}
