#include<stdio.h>
#include<Windows.h>
int main()
{
	int line = 0;
	scanf_s("%d", &line);
	int i = 0;
	int j = 0;
	//打印上半部分
	for (i = 0; i < line; i++)
	{
		for (j = 0; j < (line -1- i); j++)
		{
			printf(" ");
		}
		for (j = 0; j < (2*i+1); j++)
		{
			printf("*");
		}
		printf("\n");
	}
		//打印下半部分
	for (i = 0; i < line - 1; i++)
	{
		for (j = 0; j < i + 1; j++)
		{
			printf(" ");
		}
		for (j = 0; j < 2 * (line - 1 - i) - 1;j++)
		{
			printf("*");
		}
		printf("\n");
	}
	system("pause");
	return 0;
}