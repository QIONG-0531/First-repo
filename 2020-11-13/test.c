#include<stdio.h>
#include<Windows.h>
#pragma warning(disable:4996)
#define NAME "tom"
#define PASSWD "12345"
int Login(int times)
{
	int ret = -1;
	char name[64];
	char passwd[64];
	do{
		printf("����������˺�# ");
		scanf("%s", name);
		printf("�������������# ");
		scanf("%s", passwd);
		if (strcmp(name, NAME) == 0 && strcmp(passwd, PASSWD) == 0)
		{
			ret = 1;
			break;
		}
		else{
			times--;
			printf("�㻹��%d�λ��ᣡ\n", times);
			if (times == 0){
				printf("������˼����Ҫ��3S�����ٴγ���\n");
				Sleep(3000);
				times = 3;
			}
		}
	} while (1);
	return ret;
}
int main()
{
	int times = 3;
	int result = Login(times); //success:1, failed: -1;
	if (1 == result){
		printf("��ϲ����¼�ɹ���\n");
	}
	else{
		printf("������˼����¼ʧ�ܣ�\n");
	}
	system("pause");
	return 0;
}