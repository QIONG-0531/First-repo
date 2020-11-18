#include<stdio.h>
#include<Windows.h>
#include<assert.h>
#pragma warning(disable:4996)
int comp(const void*p1, const void*p2)
{
	int *x = (int*)p1;
	int *y = (int*)p2;
	if (*x > *y)
	{
		return 1;
	}
	else if (*x < *y)
	{
		return -1;
	}
	else
	{
		return 0;
	}
}
//实现交换
void swap(char *src, char*dst, int size)
{
	while (size)
	{
		char temp = *src;
		*src = *dst;
		*dst = temp;
		size--;
		dst++;
		src++;
	}
}
//冒泡排序
void my_qsort(void*base, size_t num,size_t size, int(*comp)(const void*, const void*))
{
	assert(base != NULL);
	assert(comp != NULL);
	char*e = (char*)base;//数组类型不明确，用char*加减容易
	for (int i = 0; i < num-1; i++)
	{
		int flag = 0;
		for (int j = 0; j < num - i - 1; j++)
		{
			if (comp(e+j*size,e+(j+1)*size)>0)
			{
				swap(e + j*size, e + (j + 1)*size,size);
				flag = 1;
			}
		}
	if (flag == 0)
		{
			break;
		}
	}
}
int main()
{
	int arr[] = { 21, 23, 13, 16, 34, 65, 10 };
	int i = 0;
	int num = sizeof(arr) / sizeof(arr[0]);
	my_qsort(arr, num, sizeof(int), comp);
	for (i = 0; i < num; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");
	system("pause");
	return 0;
}
