//*****************************
//* ???????            *
//* ??????              *
//* ???2010-12-7           *
//*****************************
int num = 1; //????1?????,?????
int flag = 2;
void way(int);
int main()
{
	int a;
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n-- != 0)
	{
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		way(a);
		System.out.print(num);
		System.out.print("\n");
		num = 1;
		flag = 2; //???
	}
	return 0;

}
void way(int a)
{
	int i;
	int max;
	max = Math.sqrt(a);
	for (i = flag;i <= max;i++) //?????????????????????
	{
		if (a % i == 0) //????????
		{
			flag = i; //??
			num++;
			way(a / i); //???????????????????
		}
	}
}


