#include <stdio.h>

int main(void)
{
	printf("char -- %u bytes, \n", sizeof(char));
	printf("short -- %u bytes \n", sizeof(short));
	printf("int -- %u bytes \n", sizeof(int));
	printf("long -- %u bytes \n", sizeof(long));
	printf("float -- %u bytes \n", sizeof(float));
	printf("double -- %u bytes \n", sizeof(double));
	
	return 0;
}