package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int z;
	int q;
	int s;
	int l;
	int a;
	int b;
	int c;
	z = q = s = l = 10;

		for (z = 10;z <= 50;z = z + 10)
		{
	  for (q = 10;q <= 50;q = q + 10)
	  {
	  for (s = 10;s <= 50;s = s + 10)
	  {
	  for (l = 10;l <= 50;l = l + 10)
	  {
	  a = z + q,b = z + l,c = z + s;
	  if (a == s + l && b > s + q && c < q)
	  {
	  System.out.print("l ");
	  System.out.print(l);
	  System.out.print("\n");
	  System.out.print("q ");
	  System.out.print(q);
	  System.out.print("\n");
	  System.out.print("z ");
	  System.out.print(z);
	  System.out.print("\n");
	  System.out.print("s ");
	  System.out.print(s);
	  System.out.print("\n");
	  }
	  }
	  }
	  }
		}
	return 0;
	}
}
