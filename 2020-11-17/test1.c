#include<stdio.h>
#include<Windows.h>
#pragma warning(disable:4996)
void show(char arr[])
{
	char t = 0;
	int num = strlen(arr);
	for (int start = 0, end = num - 1; start <= end; end--, start++)
	{
		t = arr[end];
		arr[end] = arr[start];
		arr[start] = t;
	}
	for (int start = 0; start < num; start++)
	{
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