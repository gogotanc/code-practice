#include <stdio.h>
#include <string.h>

int plus(int a, int b);

int main(void)
{
	int a = 10;
	int b = 20;
	int i = plus(a, b);
	printf("%d", i);
	
	return 0;
}

int plus(int a, int b)
{
	return a+b;
}