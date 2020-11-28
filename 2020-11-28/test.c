#include<stdio.h>
#include<Windows.h>
#pragma warning(disable:4996)
//int main()
//{
//	int arr[] = { 1, 2, 3, 4, 5, 6 };
//	int *p = arr;
//	int num = sizeof(arr) / sizeof(arr[0]);
//	for (int i = 0; i < num; i++)
//	{
//		printf("%d\n", *(p + i));
//	}
//	system("pause");
//	return 0;
//}
void show(char arr[])
{
	char t = 0;
	int num = strlen(arr);
	for (int start = 0, end = num - 1; start<=end; end--, start++)
	{
		t = arr[end];
		arr[end] = arr[start];
		arr[start] = t;
		printf("%c", arr[start]);
	}
	printf("\n");
}
int main()
{
	char arr[] = "abcdef";
	show(arr);
	system("pause");
	return 0;
}