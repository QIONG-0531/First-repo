#include<stdio.h>
#include<Windows.h>
#pragma warning(disable:4996)
int my_strcmp(const char*str1, const char*str2)
{
	while (*str1 || *str2)
	{
		if (*str1 > *str2)
		{
			return 1;
		}
		else if (*str1 < *str2)
		{
			return -1;
		}
		else
		{
			str1++;
			str2++;
		}
	}
	return 0;
}
int main()
{
	char *str1 = "abcdef";
	char*str2 = "ab123";
	printf("%d\n", my_strcmp(str1, str2));
	system("pause");
	return 0;
}