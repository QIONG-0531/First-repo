#include<stdio.h>
#include<Windows.h>
#include<math.h>
#include<string.h>
////��ӡˮ�ɻ���
//void Flower(int n)
//{
//	//��n��һ����λ��
//	int count = 0;
//	int x = n;
//	int sum = 0;
//	while (x)
//	{
//		count++;
//		x = x / 10;
//	}
//	//���λ�η�֮��
//	x = n;
//	while (x)
//	{
//		sum += pow(x% 10, count);
//		x = x / 10;
//	}
//	//�жϺ��Ƿ���������
//	if (sum == n)
//	{
//		printf("%d\n", n);
//	}
//}
//int main()
//{
//	int i = 0;
//	for (i = 100; i < 2000; i++)
//	{
//	    Flower(i);
//	}
//	system("pause");
//	return 0;
//}
//��һ���������������в��Ҿ����ĳ�����ҵ��˾ʹ�ӡ�������ڵ��±꣬�Ҳ�����������Ҳ�����
//int Found(int arr[], int num,int target)
//{
//	int start = 0;
//	int end = num - 1;
//	int mid = 0;
//	while (start <= end)
//	{
//		mid = start + (num - start) / 2;
//		if (arr[mid] > target)
//		{
//			end = mid - 1;
//		}
//		if (arr[mid] < target)
//		{
//			start = mid + 1;
//		}
//		if (arr[mid] ==target)
//		{
//			return mid;
//		}
//	}
//	return -1;
//}
//int main()
//{
//	int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88 };
//	int target = 88;
//	int num = sizeof(arr) / sizeof(arr[0]);
//	int ret = Found(arr, num,target);
//	if (ret == -1)
//	{
//		printf("�Ҳ���\n");
//	}
//	else
//	{
//		printf("%d\n", ret);
//	}
//	system("pause");
//	return 0;
//}
////�ǵݹ�ʵ��strlen
//int Strlen(char *str)
//{
//	int count = 0;
//	while (*str)
//	{
//		count++;
//		str++;
//	}
//	return count;
//}
//int main()
//{
//	char str[] = "abcdef";
//	int ret = Strlen(str);
//	printf("%d\n", ret);
//	system("pause");
//	return 0;
//}
//�ݹ�ʵ��strlen
//int Strlen(char *str)
//{
//	if (*str == '\0')
//	{
//		return 0;
//	}
//	else
//	{
//		return 1 + Strlen(str + 1);
//	}
//}
//int main()
//{
//	char *p = "abcdef";
//	int len = Strlen(p);
//	printf("%d\n", len);
//	system("pause");
//	return 0;
//}
//��дһ������ reverse_string(char * string)���ݹ�ʵ�֣�
//ʵ�֣��������ַ����е��ַ��������С�
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
//
//int main()
//{
//	char *str = "abcdef";
//	reverse_string(str);
//	printf("%s\n", str);
//	system("pause");
//	return 0;
//}
//�����������������
void Print(int arr[], int len)
{
	for (int i = 0; i < len; i++)
	{
		printf("arr[%d]= %2d \n", i, arr[i]);
	}
}
void SWAP(int arr1[], int arr2[], int len)
{
	int temp = 0;
	for (int i = 0; i < len; i++)
	{
		temp = arr1[i];
		arr1[i] = arr2[i];
		arr2[i] = temp;
	}
}

int main()
{
	int arr1[] = { 1, 21, 3, 4, 35, 6, 9 };
	int arr2[] = { 4, 5, 46, 7, 28, 9, 7 };
	int len = sizeof(arr1) / sizeof(arr1[0]);
	printf("����ǰarr1:");
	Print(arr1, len);
	printf("����ǰarr2:");
	Print(arr2, len);
	SWAP(arr1, arr2, len);
	printf("������arr1:");
	Print(arr1, len);
	printf("������arr2:");
	Print(arr2, len);
	system("pause");
	return 0;
}
