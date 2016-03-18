#include <stdio.h>

int sum(int *start, int *end);

int main(void)
{
	const int SIZE = 10;
	int arr[] = {1,2,3,4,5,6,7,8,9,0};

	int result = sum(arr, arr + SIZE);

	printf("result = %d.", result);
}

int sum(int *start, int *end)
{
	int sum = 0;

	while(start < end)
	{
		sum += start[0];
		start++;
	}

	return sum;
}