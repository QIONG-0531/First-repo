#include<stdio.h>
#include<Windows.h>
#pragma warning(disable:4996)
int my_strlen(char *str)
{
	int count = 0;
	while (*str++)
	{
		count++;
	}
	return count;
}
int main()
{
	char *str = "hello";
	printf("%d\n", my_strlen(str));
	system("pause");
	return 0;
}