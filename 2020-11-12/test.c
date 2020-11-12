#include<stdio.h>
#include<Windows.h>
//将三个数按从大到小输出
//int main()
//{
//	int a = 0;
//	int b = 0;
//	int c = 0;
//	int t = 0;
//	scanf_s("%d %d %d", &a, &b, &c);
//	if (a < b)
//	{
//		t = a;
//		a = b;
//		b = t;
//	}
//	if (a < c)
//	{
//		t = a;
//		a = c;
//		c = t;
//	}
//	if (b < c)
//	{
//		t = b;
//		b = c;
//		c = t;
//	}
//	printf("%d %d %d\n", a, b, c);
//	system("pause");
//	return 0;
//}
//给定两个数，求这两个数的最大公约数
//int Div(int a, int b)
//{
//	if (a < b)
//	{
//		int t = a;
//		a = b;
//		b = t;
//	}
//	int c = 0;
//	while(c=a%b)
//	{
//		a = b;
//		b = c;
//	}
//	return b;
//}
//int main()
//{
//	int a = 0;
//	int b = 0;
//	scanf_s("%d %d", &a, &b);
//	printf("%d\n", Div(a, b));
//	system("pause");
//	return 0;
//}
//数一下 1到 100 的所有整数中出现多少个数字9
//int main()
//{
//	int i = 0;
//	int count = 0;
//	for (i = 1; i < 100; i++)
//	{
//		if (i % 10 == 9)
//		{
//			count++;
//		}
//		if (i / 10 == 9)
//		{
//			count++;
//		}
//	}
//	printf("%d\n", count);
//	system("pause");
//	return 0;
//}
//递归和非递归分别实现求n的阶乘（不考虑溢出的问题
int Fact(int n)
{
	if (n < 2)
	{
		return 1;
	}
	return n*Fact(n - 1);
}
int main()
{
	int n = 5;
	printf("%d\n", Fact(n));
	system("pause");
	return 0;
}