int f = new int(int,int,int);
int main()
{
int w;
int a;
String tempVar = ConsoleInput.scanfRead();
if (tempVar != null)
{
	w = Integer.parseInt(tempVar);
}
for (a = 1;a < 13;a++)
{
		if (f(a,13,w))
		{
	System.out.printf("%d\n",a);
		}
}
return 0;
}
int f(int a,int b,int c)
{
int i;
int sum = 0;
for (i = 1;i < a;i++)
{
	if (i == 1)
	{
		sum += 31;
	}
	if (i == 2)
	{
		sum += 28;
	}
	if (i == 3)
	{
		sum += 31;
	}
	if (i == 5)
	{
		sum += 31;
	}
	if (i == 7)
	{
		sum += 31;
	}
	if (i == 8)
	{
		sum += 31;
	}
	if (i == 10)
	{
		sum += 31;
	}
	if (i == 4)
	{
		sum += 30;
	}
	if (i == 6)
	{
		sum += 30;
	}
	if (i == 9)
	{
		sum += 30;
	}
	if (i == 11)
	{
		sum += 30;
	}
}
sum += b;
i = (sum + c - 1) % 7;
if (i == 5)
{
	return 1;
}
else
{
	return 0;
}

}

