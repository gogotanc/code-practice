#include <stdio.h>
#include <ctype.h>

int main(void)
{

	char c;
	
	c = getchar();
	
	while(c != '\n')
	{
		if( isalpha(c) )
			putchar(c+1);
		else
			putchar(c);
		c = getchar();
	}
	putchar(c);
	
	return 0;
}