#include<stdio.h>
#include<Windows.h>
#include<string.h>
#pragma warning(disable:4996)
void reverse_str(char* begin, char* end)
{
	while (begin < end)
	{
		char tmp = *begin;
		*begin = *end;
		*end = tmp;
		begin++;
		end--;
	}
}
int main()
{
	//字符串接收
	char str[100] = { 0 };
	//一定要预留\0的位置
	fgets(str, sizeof(str)-1, stdin);
	str[strlen(str)-1] = '\0';//输入i like beijing.\n
	char *begin = str;
	char *end = str;
	//每个单词逆置
	while (*end != '\0')
	{
		while (*end != '\0' && *end != ' ')
		{
			end++;
		}
		reverse_str(begin, end - 1);
		if (*end != '\0')
		{
			end++;
		}
		begin = end;
	}
	//整个字符串逆置
	reverse_str(str, str + strlen(str)-1);
	printf("%s\n", str);
	system("pause");
	return 0;
}