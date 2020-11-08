#include<stdio.h>
#include<Windows.h>
#pragma warning(disable:4996)
//int IsPriNum(int n)
//{
//	int a = 0;
//	for (a = 2; a < n; a++)
//	{
//		if (n%a == 0)
//		{
//			return 0;
//		}
//	}
//	return 1;
//}
//int main()
//{
//	int  i = 0,ret=0;
//	for (i = 100; i <= 200; i++)
//	{
//		int ret = IsPriNum(i);//返回值为0则不是素数，为1则是素数
//		if (1 == ret)
//		{
//			printf("%d ", i);
//		}
//	}
//
//	system("pause");
//	return 0;
//}

//
//int swap(int *x, int *y)
//{
//	int t = 0;
//	t = *x;
//	*x = *y;
//	*y = t;
//}
//int main()
//{
//	int a = 10;
//	int b = 20;
//	swap(&a,&b);
//	printf("a=%d,b=%d\n", a, b);
	/*system("pause");
	return 0;
}*/
//
void print(int n)
{
	if (n > 9)
	{
		print(n / 10);
	}
	printf("%d ", n%10);
}
int main()
{
	int n = 1234;
	print(n);
	system("pause");
	return 0;
}