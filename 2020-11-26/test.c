#include<stdio.h>
#include<windows.h>
int main()
{
	int a = 0, b = 0, k = 0;
	printf("enter:");
	scanf_s("%d %d", &a, &b);
	//���Լ����շת������������Ա���������󣬽���������������������������������ֱ��������Ϊ0�����Լ��Ϊ������
	while (b)
	{
		k = a%b;
		a = b;
		b = k;
	}
	printf("���Լ��:%d\n", a);
	system("pause");
	return 0;
}