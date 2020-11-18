#include<stdio.h>
#include<Windows.h>
#include<stdlib.h>
#pragma warning(disable:4996)
int int_cmp(const void*p1, const void*p2)
{
	int *x = (int*)p1;
	int *y = (int*)p2;
	if (*x > *y)
	{
		return 1;
	}
	else if (*x < *y)
	{
		return -1;
	}
	else
	{
		return 0;
	}
}
int main()
{
	int arr[] = { 21, 23, 13, 16, 34, 65, 10 };
	int i = 0;
	int num = sizeof(arr) / sizeof(arr[0]);
	qsort(arr,num, sizeof(int), int_cmp);
	for (i = 0; i < num; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");
	system("pause");
	return 0;
}