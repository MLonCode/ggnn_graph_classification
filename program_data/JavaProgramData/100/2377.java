package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0; //?????????
		int[] a = new int[26]; //?????????????a[0]=x,??????a???
		int[] A = new int[26];
		//x??
		int temp = 0; //????
		char c;
		int test = 1; //???????????????
		for (i = 0;i < 300;i++)
		{
			c = System.in.read(); //??????.
			//??????????300??????????
			//??????????,????????????
			if ('\n' == c)
			{
				break;
			}
			temp = c - 'a';
			if (0 <= temp != 0 && temp < 26)
			{
				a[temp]++;
			}
			 temp = c - 'A';
			if (0 <= temp != 0 && temp < 26)
			{
				A[temp]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			//???????????????test=1,???0
			 if (A[i] != 0)
			 {
				System.out.printf("%c=%d\n",('A' + i),A[i]);
				test = 0;
			 }
		}
		 for (i = 0;i < 26;i++)
		 {
			 if (a[i] != 0)
			 {
				System.out.printf("%c=%d\n",('a' + i),a[i]);
				test = 0;
			 }
		 }
		if (test != 0)
		{
			System.out.print("No\n");
		}

	}
}
