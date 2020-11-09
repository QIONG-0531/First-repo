#include"game.h"
int main()
{
	int quit = 0;
	while (!quit){
		Menu();
		int select = 0;
		scanf_s("%d", &select);
		switch (select){
		case 1:
			Game();
			break;
		case 2:
			quit = 1;
			printf("ByeBye\n");
			break;
		default:
			printf("输入有误，请重新输入\n");
			break;
		}
	}
	system("pause");
	return 0;
}