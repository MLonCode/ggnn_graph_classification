package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[] a = {' ', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int[] w = new int[60];
		int[] q = new int[60];
		int m;
		int l;
		int g;
		int n;
		int j;
		int i;
		int max;
		int min;
		int f;
		a = new Scanner(System.in).nextLine();
		g = a.length();
		a[g] = ' ';
		a[g + 1] = '\0';
		q[0] = -1;
		for (i = 1,j = 1;i < 200;i++)
		{
			if (a[i] == ' ' && a[i - 1] <= 'z' && a[i - 1] >= 'a')
			{
				q[j] = i;
				j++;
			}
			if (a[i] == ' ' && a[i - 1] <= 'Z' && a[i - 1] >= 'A')
			{
				q[j] = i;
				j++;
			}
		}
		l = j;
		for (m = 0;m < l;m++)
		{
			w[m] = q[m + 1] - q[m];
		}
		max = 0;
		min = 0;
		for (n = 1;n < l;n++)
		{
			if (w[max] < w[n])
			{
				max = n;
			}
			 if (w[min] > w[n] && w[n] > 0)
			 {
				 min = n;
			 }
		}
		f = q[max] + 1;
		a[q[max + 1]] = '\0';
		System.out.printf("%s\n", a[f]);
		f = q[min] + 1;
		a[q[min + 1]] = '\0';
		System.out.printf("%s\n", a[f]);
		return;
	}
}
