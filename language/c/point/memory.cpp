#include <iostream>
using namespace std;

void getMemory(char **p, int num)
{
	*p = (char *)malloc(sizeof(char) * num);
}

int main()
{
	char *str = NULL;
	getMemory(&str, 10);
	strcpy(str, "hello");
	cout << *str << endl;
	cout << str << endl;
	cout << &str << endl;
	return 0;
}