#include"game.h"
void  Menu()
{
	printf("########################\n");
	printf("##1.Play        2.Exit##\n");
	printf("########################\n");
	printf("Please  select#");
}
void Game()
{
		srand((unsigned long)time(NULL));//����һ�������
		int r = rand() % RANGE + 1;//�������Χ���1-100
	while (1){
		int n = 0;
		printf("���#");
		scanf_s("%d", &n);
		if (n < r){
			printf("���С��\n");
		}
		else if (n>r){
			printf("��´���\n");
		}
		else{
			printf("��ϲ��¶���\n");
			break;
		}
	}

}