#include<stdio.h>
#include<Windows.h>
#include<string.h>
#pragma warning(disable:4996)
int Find(const char*str1, char *str2)
{
	char temp[1024] = { 0 };
	strcpy(temp, str1);
	strcat(temp, str1);
	char *arr=strstr(temp, str2);//旋转后的字符串一定是aabcdaabcd的子集
	if (arr != NULL)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
int main()
{
	char*str1 = "aabcd";
	char*str2 = "ab123";
	printf("%d\n", Find(str1,str2));
	system("pause");
	return 0;
}
