package <missing>;

public class GlobalMembers
{
	/**
	*???4.cpp
	*??????
	*???????
	*???12?1?
	*/
	public static int num; //??num??????s???????
	public static int s = 1;
	public static void divide(int n,int a) //?????n????a??????
	{
	for (int i = n;i <= a / s;i++) //??
	{
	s *= i;
	if (s == a) //???????a???????+1
	{
	num++;
	}
	else if (s < a && a % s == 0) //??????a,??????????
	{
	divide(i, a);
	}
	s /= i; //????
	}
	}
	public static int Main() //???
	{
	int n;
	int i;
	int a;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
	num = 0; //????????0
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	divide(2, a); //??????
	System.out.print(num);
	System.out.print("\n");
	}
	return 0;
	}
}

