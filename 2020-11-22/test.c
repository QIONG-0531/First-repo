#include<stdio.h>
#include<assert.h>
#include<Windows.h>
char *my_strstr(const char*str, const char* sub_str)
{
	assert(str);
	assert(sub_str);
	while (*str)//ȷ��ÿ�αȽϵ���ʼλ��
	{
		const char*p = str;
		const char*q = sub_str;
		while (*p&&*q&&*p==*q)//�ֲ��Ƚ�
		{
			p++;
			q++;
		}
		if (*q == '\0')
		{
			return str;
		}
		str++;
	}
	return NULL;
}
int main()
{
	const char *str1 = "abc 123 abc 1234 feg xyz";
	const char *str2 = "1234";
	char *ret=my_strstr(str1, str2);
	printf("%s\n", ret);
	system("pause");
	return 0;
}