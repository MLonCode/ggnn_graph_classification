package <missing>;

public class GlobalMembers
{
	//???????
	//??????????
	//???1000012750?
	public static int Main() //?????
	{ //?????
		int s; //????
		int a;
		int b;
		int c;
		int d;
		int e;
		s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = s / 10000; //??????
		b = (s - a * 10000) / 1000; //??????
		c = (s - a * 10000 - b * 1000) / 100; //??????
		d = (s - a * 10000 - b * 1000 - c * 100) / 10; //??????
		e = s % 10; //??????
		if (a != 0) //????????????????
		{
			s = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
		}
		else if (b != 0)
		{
			s = e * 1000 + d * 100 + c * 10 + b;
		}
		else if (c != 0)
		{
			s = e * 100 + d * 10 + c;
		}
		else if (d != 0)
		{
			s = e * 10 + d;
		}
		else
		{
			s = e;
		}
		System.out.print(s);
		return 0; //???????????????????
	} //?????
}

