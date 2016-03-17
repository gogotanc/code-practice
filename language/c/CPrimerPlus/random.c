#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void)
{	
	srand(time(NULL));
	
	for(int i=0; i<10; i++)
	{
		printf("random num is %d \n", rand()%6 + 1);
	}
}