#include <stdio.h>
/*

������Ϊ��ַ

*/
int sum(int *arr);

int main(void)
{
	int arr[] = {1,1,1,1,1,1,1,1,1,1};

	int result = sum(arr);

	printf("result is %d.", result);
}

int sum(int *arr)
{
	int sum = 0;

	for(int i=0; i<10; i++)
	{
		sum += arr[i];
	}

	return sum;
}