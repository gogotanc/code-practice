#include <stdio.h>

int main(void)
{
	int data = 100;

	printf("dec = %d, octal = %o, hex = %x, binary = %b \n", data, data, data, data);

	printf("dec = %d, octal = %#o, hex = %#x \n", data, data, data);

	return 0;
}