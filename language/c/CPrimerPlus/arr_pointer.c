#include <stdio.h>

int main(void)
{
	const char *p[3] = {"ni","hao","bu"};
	
	int (*a)[2];
	a = (int [2][2]) {{1,2},{3,4}};
	
	int *aa;
	*aa = 3;
	
	for(int i=0; i<3; i++)
	{
		puts(p[i]);
	}
}