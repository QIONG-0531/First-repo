#include<stdio.h>
#include<Windows.h>
#include<string.h>
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
	printf("˝ťťťÇ°arr1:");
	Print(arr1, len);
	printf("˝ťťťÇ°arr2:");
	Print(arr2, len);
	SWAP(arr1, arr2, len);
	printf("˝ťťťşóarr1:");
	Print(arr1, len);
	printf("˝ťťťşóarr2:");
	Print(arr2, len);
	system("pause");
	return 0;
}

