package <missing>;

public class GlobalMembers
{
	public static int n; //????  n ???????
	public static int i;
	public static int f(int a,int min)
	{ //??????f  ?????a n
	if (a < min)
	{ //?????a ??n
	return 0; //????0?   ???????????
	}
	int result = 1; //???????  ???1
	for (int i = min;i < a;i++)
	{ //for?? ? ??????a
	if (a % i == 0)
	{ //?a???i???
	result += f(a / i, i); //???? ??result
	}
	}
	return result; //??????
	}
		  public static int Main()
		  { //?????
			  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  int[] a = new int[n];
			  for (i = 0;i < n;i++)
			  { //????
				  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  }
			  for (i = 0;i < n;i++)
			  {
			  System.out.print(f(a[i], 2));
			  System.out.print("\n");
			  }
			  return 0;
		  }
}

