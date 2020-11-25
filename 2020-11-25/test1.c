#include<stdio.h>
#include<Windows.h>
#include<string.h>
#pragma warning(disable:4996)
void leftround(char* str, int time)
{
	int len = strlen(str);
	char temp = 0;
	time = time%len;
	int i = 0;
	int j = 0;
	for (i = 0; i < time; i++)
	{
		temp = *str;
		for (j = 0; j < len - 1; j++)
		{
			*(str + j) = *(str + j + 1);
		}
		*(str + j) = temp;
	}
}
int main()
{
	char str[] = "abcde";
	leftround(str, 1);
	printf("%s\n", str);
	system("pause");
	return 0;
}