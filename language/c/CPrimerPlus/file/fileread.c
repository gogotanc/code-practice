#include <stdio.h>

int main(int argc, char **argv)
{
	FILE *f;

	f = fopen("input.txt", "r");

	if(f == NULL)
	{
		return -1;
	}

	char ch;

	ch = getc(f);

	while(ch != EOF)
	{
		putchar(ch);
		ch = getc(f);
	}
}