/*?1???? m ??? n ???????????
??????????????1????????????? 1 ????
?1????????????? n ??????? k ( k < n )??
???????k???????????1???
? 2 ?????????????? n ??????? k ????????? k ????
??????1??????????????????????? n ??????? k ??
????? k ??????????1????
????????????????1?????????? n ? k??????? m*/
//Goofy 2010 11 26
int MinApp = new int(int,int);
int main()
{
	int n;
	int k;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.out.print(MinApp(n,k));
	System.out.print("\n");
	return 0;
}

int MinApp(int n,int k)
{
	int i; //i?????????????
	int j;
	int Apple;
	for (i = 1;;i++)
	{
		Apple = n * i + k;
		for (j = 1; j < n; j++)
		{
			if ((Apple % (n - 1)) == 0) //????
			{
				Apple = Apple * n / (n - 1) + k;
			}
			else
			{
				break;
			}
		}
		if (j == n)
		{
			break;
		}
	}
	return (Apple);
}

