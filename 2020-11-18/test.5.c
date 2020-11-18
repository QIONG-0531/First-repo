#include<stdio.h>
#include<Windows.h>
#include<stdlib.h>
#include<string.h>
#pragma warning(disable:4996)
int char_cmp(const void*p1, const void*p2)
{
	char *x = *(char**)p1;
	char *y = *(char**)p2;
	return strcmp(x, y);
}
int main()
{
	
	char *str[] = { "abcd", "a123", "b123" };
	int num = sizeof(str) / sizeof(str[0]);
	int i = 0;
	qsort(str, num, sizeof(char*), char_cmp);
	for (i = 0; i < num; i++)
	{
		printf("%s\n", str[i]);
	}
	system("pause");
	return 0;
}