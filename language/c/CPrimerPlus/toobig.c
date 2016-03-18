#include <stdio.h>

int main(void)
{
	int data = 2147483647;

	unsigned int u = 4294967295;

	printf("dec = %d...%d...%d \n", data, data+1, data+2);

	printf("dec = %u...%u...%u \n", u, u+1, u+2);

	_Bool bool = 2;

	printf("dec = %d ", bool);

	return 0;
}