#include<stdio.h>
#include<Windows.h>
char *my_strcpy(char *dst, const char*src)
{
	char *ret = dst;
	while (*src)
	{
		*dst = *src;
		dst++;
		src++;
	}
	return ret;
}
int main()
{
	char str1 [12]= "adcdef";
	const char *str2 = "1234";
	printf("%s\n", my_strcpy(str1, str2));
	system("pause");
	return 0;

}