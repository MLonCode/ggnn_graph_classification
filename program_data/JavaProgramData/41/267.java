package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s1;
		int s2;
		int s3;
		int s4;
		int s5;
		int f1;
		int f2;
		int f3;
		int f4;
		int f5;
		for (f1 = 1;f1 <= 6;f1++)
		{
			for (f2 = 1;f2 < 6;f2++)
			{
			for (f3 = 1;f3 < 6;f3++)
			{
					for (f4 = 1;f4 < 6;f4++)
					{
						f5 = 15 - f1 - f2 - f3 - f4;
					s1 = (f5 == 1);
					s2 = (f2 == 2);
					s3 = (f1 == 5);
					s4 = (f3 != 1);
					s5 = (f4 != 1);
					if (f5 > 0 && f5 != 2 && f5 != 3 && f1 != f2 && f1 != f3 && f1 != f4 && (s2 + s3) == 2 && s1 == 0 && s4 == 0 && f1 != f5 && f2 != f3 && f2 != f4 && f2 != f5 && f3 != f4 && f3 != f5 && f4 != f5)
					{
						System.out.print(f1);
						System.out.print(" ");
						System.out.print(f2);
						System.out.print(" ");
						System.out.print(f3);
						System.out.print(" ");
						System.out.print(f4);
						System.out.print(" ");
						System.out.print(f5);
						System.out.print("\n");
					}
					}
			}
			}
		}
					return 0;
	}


}
