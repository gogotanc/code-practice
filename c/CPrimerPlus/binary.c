#include <stdio.h>

void toBinary(int num);

int main(void)
{
	toBinary(24);
}


// �ݹ�ʵ��
void toBinary(int num)
{
	int r = num % 2;
	if(num >= 2)
		toBinary(num/2);
	putchar('0'+r);
}