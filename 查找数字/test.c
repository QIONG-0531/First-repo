#include<stdio.h>
#include<Windows.h>
#pragma warning(disable:4996)
int Binsearch(int arr[], int num, int target)
{
	int start = 0;
	int end = num - 1;
	while (start <= end)
	{
		int mid = (end - start) / 2;
		if (target < arr[mid])
		{
			end = mid - 1;
		}
		else if (target>arr[mid])
		{
			start = mid + 1;
		}
		else return mid;
	}
	return -1;
}
int main()
{
	int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88 };
	int target = 77;
	int num = sizeof(arr) / sizeof(arr[0]);
	int ret = Binsearch(arr, num, target);//找到返回数组下标，未找到返回-1
	if (ret == -1)
	{
		printf("未找到！\n");
	}
	else
	{
		printf("%d\n", arr[ret]);
	}
	system("pause");
	return 0;
}
