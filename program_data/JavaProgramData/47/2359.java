package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int n; //????n,i???a[100]
		int i = 0;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i < n) //???????i<n?????????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
		} //?????i??1
		for (;i > 1;i--) //????????????????i>1????????i??1
		{
			System.out.print(a[i - 1]);
			System.out.print(" ");
		}
		System.out.print(a[0]);
		System.out.print("\n");
		return 0; //??????
	}
}

