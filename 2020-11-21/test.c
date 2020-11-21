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
	printf("你有多少钱：");
	scanf_s("%d", &money);
	int ret = Qishui(money);
	printf("可以买%d瓶汽水\n", ret);
	system("pause");
	return 0;
}