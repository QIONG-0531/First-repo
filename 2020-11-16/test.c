#include<stdio.h>
#include<Windows.h>
#include<stdlib.h>
#include<string.h>
#include<assert.h>
#pragma warning(disable:4996)
//int Compstr(const void*_xp, const void*_yp)
//{
//	int *xp = (int *)_xp;
//	int *yp = (int *)_yp;
//	if (*xp > *yp)
//	{
//		return 1;
//	}
//	else if (*xp < *yp)
//	{
//		return -1;
//	}
//	else
//	{
//		return 0;
//	}
//}
int Compstr(const void*_xp, const void*_yp)
{
	char *s1 = *(char**)_xp;
	char *s2 = *(char**)_yp;
	return strcmp(s1, s2);
}
void swap(char *src, char *dst, int size)
{
	while (size){
		char temp = *src;
		*src = *dst;
		*dst = temp;
		size--;
		src++, dst++;
	}
}
void my_qsort(void *arr, int num, int size, int(*comp)(const void*, const void*))
{
	assert(arr != NULL);
	assert(comp != NULL);
	char *e = (char*)arr;
	for (int i = 0; i < num - 1; i++){
		int flag = 0;
		for (int j = 0; j < num - 1 - i; j++){
			if (comp(e + j*size, e + (j + 1)*size) > 0){
				flag = 1;
				swap(e + j*size, e + (j + 1)*size, size);
			}
		}

		if (flag == 0){
			break;
		}
	}
}
int main()
{
	char *arr[] = { "b1234", "a1234", "4321", "abcdef" };
	int num = sizeof(arr) / sizeof(arr[0]);
	/*int arr[] = { 23, 23, 123, 234, 556, 56 };
	int num = sizeof(arr) / sizeof(arr[0]);*/
	my_qsort(arr, num, sizeof(char*), Compstr);
	system("pause");
	return 0;
}
