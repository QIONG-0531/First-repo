#include<stdio.h>
#include<Windows.h>
//�����������Ӵ�С���
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
//���������������������������Լ��
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
//��һ�� 1�� 100 �����������г��ֶ��ٸ�����9
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
//�ݹ�ͷǵݹ�ֱ�ʵ����n�Ľ׳ˣ����������������
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