#include <stdio.h>
#include <string.h>

int main(void)
{
	char *c = "tanc";
	char cc[20];
	
	scanf("%s", cc);
	
	printf("%d...%d \n", strlen(c), sizeof(c));
	printf("%d...%d \n", strlen(cc), sizeof(cc));
	
	return 0;
}