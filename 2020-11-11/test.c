#include<stdio.h>
#include<Windows.h>
#include<string.h>
//�����ַ���
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
//дһ���ݹ麯��DigitSum(n)������һ���Ǹ����������������������֮��
//���磬����DigitSum(1729)����Ӧ�÷���1 + 7 + 2 + 9�����ĺ���19
//���룺1729�������19
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
//	printf("����һ����:");
//	scanf_s("%d", &num);
//	printf("%d\n", DigitSum(num));
//	system("pause");
//	return 0;
//}
//��дһ������ʵ��n��k�η���ʹ�õݹ�ʵ�֡�
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
//�ݹ�ʵ�����n��쳲�������
//���磺
//���룺5  �����5
//���룺10�� �����55
//���룺2�� �����1
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
//�ǵݹ�ʵ�����n��쳲�������
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
//ʵ��һ�������������ð������
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
//ʵ�ֺ���int() ��ʼ������Ϊȫ0
//ʵ��print()  ��ӡ�����ÿ��Ԫ��
//ʵ��reverse()  �����������Ԫ�ص����á�
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
//������A�е����ݺ�����B�е����ݽ��н�����������һ����
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


