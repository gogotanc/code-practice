/**
 *	2¡¢Valid Parentheses
 *		Given a string containing just the characters ¡® ( ¡¯, ¡® ) ¡¯, ¡® { ¡¯, ¡® } ¡¯, ¡® [ ¡¯ and ¡® ] ¡¯, determine if the input string is valid.
 *	The brackets must close in the correct order, ¡°( )¡± and ¡°( ) [ ] { }¡± are all valid but ¡°( ]¡± and ¡°( [ ) ]¡± are not.
 */

#include<stdio.h>
#include <string.h>

int main()
{
	char c[255];
	int count[] = {0, 0, 0};

	scanf("%s", &c);

	int len = strlen(c);

	for(int i=0; i<len; i++)
	{
		switch(c[i])
		{
			case '(':
				count[0]++;
				break;
			case ')':
				if(count[0]>0)
					count[0]--;
				else
				{
					printf("input invalid");
					return 0;
				}
				break;
			case '{':
				count[1]++;
				break;
			case '}':
				if(count[1]>0)
					count[1]--;
				else
				{
					printf("input invalid");
					return 0;
				}
				break;
			case '[':
				count[2]++;
				break;
			case ']':
				if(count[2]>0)
					count[2]--;
				else
				{
					printf("input invalid");
					return 0;
				}
				break;
		}
	}

	int result = 0;

	for(int i=0; i<3; i++)
	{
		result += count[i];
	}

	if(result == 0)
		printf("input valid");
	else
		printf("input invalid");

	return 0;
}