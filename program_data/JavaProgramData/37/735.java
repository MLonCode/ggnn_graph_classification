import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*******************************
	//???????????????
	//?????
	//???2011-11-7
	//*******************************
	public static int Main()
	{
		String a = new String(new char[100000]); //???????
		final String b = "abcdefghijklmnopqrstuvwxyz"; //???????????
		int[] c = new int[100000]; //???????????????
		int i; //??????
		int j;
		int x;
		int y = 0;
		int min;
		int t;
		int k;
		int first = 1;
		int count = 0;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= t;k++)
		{
			for (i = 0;i <= 99999;i++) //?c?????
			{
				c[i] = 100000;
			}
			y = 0; //?y???
			if (first == 1) //????????????
			{
				System.in.read();
				first = 0;
			}
			a = new Scanner(System.in).nextLine(); //?????
			for (i = 0;b.charAt(i) != '\0';i++)
			{
				count = 0; //?????????
				for (j = 0;a.charAt(j) != '\0';j++)
				{
					if (b.charAt(i) == a.charAt(j)) //??????????26??????????????????
					{
						x = j; //?????????????
						count++; //????????
					}
				}
				if (count == 1) //???????????????c???
				{
					c[y] = x;
					y++;
				}
			}
			if (c[0] == 100000) //?c[0] = 100?????????????
			{
				System.out.print("no");
				System.out.print("\n");
			}
			else
			{
				min = c[0]; //?c[0]????
				for (i = 1;i <= 99999;i++) //?????
				{
					if (min > c[i])
					{
						min = c[i];
					}
				}
				System.out.print(a.charAt(min));
				System.out.print("\n");
			}
		}
		return 0;
	}
}

