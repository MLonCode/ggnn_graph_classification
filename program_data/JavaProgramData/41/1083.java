package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int D;
		int E;
		for (A = 1;A <= 5;A++)
		{
		for (B = 1;B <= 5;B++)
		{
		for (C = 1;C <= 5;C++)
		{
		for (D = 1;D <= 5;D++)
		{
		for (E = 1;E <= 5;E++)
		{
			if (((E != 2) + (E != 3) == 2) && ((A != B) + (A != C) + (A != D) + (A != E) + (B != C) + (B != D) + (B != E) + (C != D) + (C != E) + (D != E) == 10) && ((E == 1) + (B == 2) + (A == 5) + (C != 1) + (D == 1) == 2) && ((A == 5) + (B == 2) + (C == 1) + (D == 3) == 4))
			{
			System.out.print(A);
			System.out.print(" ");
			System.out.print(B);
			System.out.print(" ");
			System.out.print(C);
			System.out.print(" ");
			System.out.print(D);
			System.out.print(" ");
			System.out.print(E);
			}
		}
		}
		}
		}
		}
				  return 0;
	}

}
