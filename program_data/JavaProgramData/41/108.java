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
		for (E = 1; E <= 5; E++)
		{
			for (A = 1; A < 6; A++)
			{
				for (B = 1; B < 6; B++)
				{
					for (C = 1; C < 6; C++)
					{
						for (D = 1; D < 6; D++)
						{
							int[] right = new int[6];
							if (E == 1)
							{
								right[A] = 1;
							}
							if (B == 2)
							{
								right[B] = 1;
							}
							if (A == 5)
							{
								right[C] = 1;
							}
							if (C != 1)
							{
								right[D] = 1;
							}
							if (D == 1)
							{
								right[E] = 1;
							}
							if ((E == 1) + (A == 5) + (B == 2) + (D == 1) + (C != 1) == 2 && A + B + C + D + E == 15 && A * B * C * D * E == 120 && right[1] == 1 && right[2] == 1 && E != 2 && E != 3)
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
								System.out.print("\n");
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
