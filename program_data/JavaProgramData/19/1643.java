import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}; //???????a??????b?????c????????
		char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	int i; //i,j,k,m????????count????
	int j;
	int k;
	int m;
	int count = 0;
	int x;
	int y;
	int al;
	int bl;
	int cl;
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	c = new Scanner(System.in).nextLine();
	al = a.length(); //??????????
	bl = b.length();
	cl = c.length();
	for (i = 0;i <= 100;i++)
	{
			for (j = 0;j < bl;j++)
			{
				if (a[i + j] == b[j]) //?a???b????????????????????+1
				{
				count++;
				}
			} //????=b?????????????b?????????????????????0
				x = ((i > 0) && (a[i - 1] == ' ') && ((a[i + bl] == ' ') || a[i + bl] == (char)0)); //?????????????????????
				y = ((i == 0) && ((a[i + bl] == ' ' || a[i + bl] == (char)0))); //???????????????
				if (count == bl && (x != 0 || y != 0)) //?????????a???????????
				{
					if (bl >= cl) //?????????
					{
						for (k = 0;k < cl;k++)
						{
						a[i + k] = c[k]; //??????????????????????
						}
					for (m = i + cl;m < al - cl;m++)
					{
						a[m] = a[m - cl + bl];
					}
					} //?????????
				else //??????????????
				{
						for (m = 100;m >= i + cl;m--)
						{
						a[m] = a[m - (cl - bl)]; //?????????????c??
						}
					for (k = 0;k < cl;k++) //???c
					{
						a[i + k] = c[k];
					}

				}

				}

		count = 0;
	}
	System.out.print(a);
	}

}
