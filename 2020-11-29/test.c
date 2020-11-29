#include<stdio.h>
#include<Windows.h>
#include<string.h>
//逆序字符串
//void reverse_string(char* arr)
//{
//	int len = strlen(arr);
//	char tmp = *arr;
//	*arr = *(arr + len - 1);
//
//	*(arr + len - 1) = '\0';
//	if (strlen(arr + 1) >= 2)
//		reverse_string(arr + 1);
//
//	*(arr + len - 1) = tmp;
//}
//int main()
//{
//	char *str = "abcdef";
//	reverse_string(str);
//	printf("%s\n", str);
//	system("pause");
//	return 0;
//}
//写一个递归函数DigitSum(n)，输入一个非负整数，返回组成它的数字之和
//例如，调用DigitSum(1729)，则应该返回1 + 7 + 2 + 9，它的和是19
//输入：1729，输出：19
//int DigitSum(int num)
//{
//	if (num < 10)
//	{
//		return num;
//	}
//	return num % 10 + DigitSum(num / 10);
//}
//int main()
//{
//	int num = 0;
//	printf("输入一个数:");
//	scanf_s("%d", &num);
//	printf("%d\n", DigitSum(num));
//	system("pause");
//	return 0;
//}
//编写一个函数实现n的k次方，使用递归实现。
//int cifang(int num, int k)
//{
//	if (k ==0)
//	{
//		return 1;
//	}
//	if (k == 1)
//	{
//		return num;
//	}
//		return num*cifang(num,k-1);
//	
//}
//int main()
//{
//	int num = 2;
//	int k = 10;
//	printf("%d\n",cifang(num, k));
//	system("pause");
//	return 0;
//}
//递归实现求第n个斐波那契数
//例如：
//输入：5  输出：5
//输入：10， 输出：55
//输入：2， 输出：1
//int Feibo(int num)
//{
//	if (num < 3)
//	{
//		return 1;
//	}
//	return Feibo(num - 1) + Feibo(num - 2);
//}
//int main()
//{
//	int n = 0;
//	scanf_s("%d", &n);
//	printf("%d\n", Feibo(n));
//	system("pause");
//	return 0;
//}
//非递归实现求第n个斐波那契数
//int Feibo(int num)
//{
//	int a = 1;
//	int b = 1;
//	int c = a+b;
//	if (num < 3)
//	{
//		return 1;
//	}
//	else
//	{
//		for (int i = 0; i <= num - 3; i++)
//		{
//			c = a + b;
//			a = b;
//			b = c;
//		}
//		return c;
//	}
//}
//int main()
//{
//  int n = 0;
//  scanf_s("%d", &n);
//  printf("%d\n", Feibo(n));
//  system("pause");
//  return 0;
//}
//实现一个对整形数组的冒泡排序
//void Maopao(int arr[], int num)
//{
//	int tmp = 0;
//	int flag = 0;
//	for (int i = 0; i < num-1; i++)
//	{
//		int j = 0;
//		for (j = 0; j < num - i-1;j++)
//		{
//			if (arr[j]>arr[j + 1])
//			{
//				flag = 1;
//				tmp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = tmp;
//			}
//		}
//	}
//	if (!flag)
//	{
//		return;
//	}
//
//}
//int main()
//{
//	int arr[] = { 3, 2, 1, 4, 6, 5, 9, 8, 7 };
//	int num = sizeof(arr) / sizeof(arr[0]);
//	Maopao(arr, num);
//	for (int i = 0; i < num; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	printf("\n");
//	system("pause");
//	return 0;
//}
//实现函数int() 初始化数组为全0
//实现print()  打印数组的每个元素
//实现reverse()  函数完成数组元素的逆置。
//void reverse(int arr[], int num)
//{
//	int start = 0;
//	int end = num - 1;
//	int tmp = 0;
//	for (start = 0, end = num - 1; start <= end; start++, end--)
//	{
//		tmp = arr[start];
//		arr[start] = arr[end];
//		arr[end] = tmp;
//	}
//}
//int main()
//{
//	int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88 };
//	int num = sizeof(arr) / sizeof(arr[0]);
//	reverse(arr, num);
//	for (int i = 0; i < num; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	printf("\n");
//	system("pause");
//	return 0;
//}
//将数组A中的内容和数组B中的内容进行交换。（数组一样大）
void swap(int arr1[], int arr2[], int num)
{
	int tmp = 0;
	for (int i = 0; i < num; i++)
	{
		tmp = arr1[i];
		arr1[i] = arr2[i];
		arr2[i] = tmp;
	}
}
void print(int arr[],int  num)
{
	for (int i = 0; i < num; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");
}
int main()
{
	int arr1[] = { 1, 2, 3, 4, 5 };
	int arr2[] = { 6, 7, 8, 9, 0 };
	int num = sizeof(arr1) / sizeof(arr1[0]);
	swap(arr1, arr2, num);
	print(arr1, num);
	print(arr2, num);
	system("pause");
	return 0;
}


