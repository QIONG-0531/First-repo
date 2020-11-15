#include<stdio.h>
#include<Windows.h>
#include<stdlib.h>
#include<string.h>
#pragma warning(disable:4996)
//int Compstr(const void*_xp, const void*_yp)
//{
//	int *xp = (int *)_xp;
//	int *yp = (int *)_yp;
//	if (*xp > *yp)
//	{
//		return 1;
//	}
//	else if (*xp < *yp)
//	{
//		return -1;
//	}
//	else
//	{
//		return 0;
//	}
//}
void Print(int arr[], int  num)
{
	for (int i = 0; i < num; i++)
	{
		printf("%d ", arr[i]);
	}
}
int Compstr(const void*_xp, const void*_yp)
{
	char *s1 = *(char**)_xp;
	char *s2 = *(char**)_yp;
	return strcmp(*s1, *s2);
}

int main()
{
	char *arr[] = { "b1234", "a1234", "4321", "abcdef" };
	int num = sizeof(arr) / sizeof(arr[0]);
	/*int arr[] = { 23, 23, 123, 234, 556, 56 };
	int num = sizeof(arr) / sizeof(arr[0]);*/
	qsort(arr, num, sizeof(char*), Compstr);
	Print(arr, num);
	printf("\n");
	system("pause");
	return 0;
}