#include <stdio.h>

int getMyNum(void);

int main(void)
{
	printf("Concrete contains gravel and cement. \n");
	printf("my favorite number is %d. \n", getMyNum());
	return 0;
}

int getMyNum(void)
{
	return 3;
}