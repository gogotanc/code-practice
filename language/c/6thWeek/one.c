/**
 *	1¡¢Factorial Trailing Zeroes
 *		Given an integer n, return the number of trailing zeroes in n!.
 *	Note: Your solution should be in logarithmic time complexity.
 */

 #include <stdio.h>

long jiecheng(long);
int parse(long);

int main()
{
	long n;

	scanf("%ld", &n);

	long d = jiecheng(n);

	printf("%ld...\n", d);

	int result = parse(d);

	printf("%d...\n", result);
}

long jiecheng(long n)
{
	if(n<=1)
		return 1;
	return n*jiecheng(n-1);
}

int parse(long data)
{

	long a = 10;
	int result = 0;

	while(1)
	{
		if((data%a)!=0)
			break;
		result++;
		a*=10;
	}
	return result;
}