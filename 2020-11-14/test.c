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
	//�ַ�������
	char str[100] = { 0 };
	//һ��ҪԤ��\0��λ��
	fgets(str, sizeof(str)-1, stdin);
	str[strlen(str)-1] = '\0';//����i like beijing.\n
	char *begin = str;
	char *end = str;
	//ÿ����������
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
	//�����ַ�������
	reverse_str(str, str + strlen(str)-1);
	printf("%s\n", str);
	system("pause");
	return 0;
}