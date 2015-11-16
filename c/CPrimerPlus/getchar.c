#include <stdio.h>

int main(void)
{

	char c;
	
	c = getchar();
	
	while(c != '\n')
	{
		if(c != ' ')
			putchar(c+1);
		else
			putchar(c);
		c = getchar();
	}
	putchar(c);
	
	return 0;
}