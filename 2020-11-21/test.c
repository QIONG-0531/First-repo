#include<stdio.h>
#include<Windows.h>
#pragma warning(disable:4996)
int Qishui(int money)
{
	int total = money;
	int empty = money;
	while (empty > 1)
	{
		total += empty / 2;
		empty = empty / 2 + empty % 2;
	}
	return total;
}
int main()
{
	int money = 0;
	printf("���ж���Ǯ��");
	scanf_s("%d", &money);
	int ret = Qishui(money);
	printf("������%dƿ��ˮ\n", ret);
	system("pause");
	return 0;
}