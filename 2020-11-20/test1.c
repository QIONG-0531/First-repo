#include<stdio.h>
#include<Windows.h>
#pragma warning(disable:4996)
int mul(int n)
{
	int ret = 1;
	for (int i = 2; i <= n; i++)
	{
		ret *= i;
	}
	return ret;
}
int main()
{
	int num = 5;
	printf("%d\n", mul(num));
	system("pause");
	return 0;
}
#include<stdio.h>
#include<Windows.h>
#pragma warning(disable:4996)
int mul(int n)
{
	if (n <= 1)
	{
		return 1;
	}
	return n*mul(n - 1);
}
int main()
{
	int num = 5;
	printf("%d\n", mul(num));
	system("pause");
	return 0;
}
