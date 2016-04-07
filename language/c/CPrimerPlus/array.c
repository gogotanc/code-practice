#include <stdio.h>
/**
 * 数组求和
 * @param  arr 求和的数组
 * @return     数组和
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