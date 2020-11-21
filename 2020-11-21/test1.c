#include<stdio.h>
#include<Windows.h>
#pragma warning(disable:4996)
int SUM(int n)
{
	int a = n;
	int sum = 0;
	for (int i = 1; i < 6; i++)
	{
		sum += n;
		n = n * 10 + a;
	}
	return sum;
}
int main()
{
	int n = 0;
	printf("enter:");
	scanf_s("%d", &n);
	int ret = SUM(n);
	printf("sum=%d\n", ret);
	system("pause");
	return 0;
}