package <missing>;

public class GlobalMembers
{
	public static int[] prime = new int[50001];
	public static int isPrime(int a)
	{
			for (int i = 2;i * i <= a;i++)
			{
					if (a % i == 0)
					{
							return 0;
					}
			}
			return 1;
	}
	public static int Main()
	{
			int n;

			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			prime[2] = 1;
			for (int i = 6;i <= n;i += 2)
			{
					if (isPrime(i - 2) != 0)
					{
									System.out.print(i);
									System.out.print("=");
									System.out.print(2);
									System.out.print("+");
									System.out.print((i - 2));
									System.out.print("\n");
									continue;
					}

					for (int j = 3;j * 2 <= i;j += 2)
					{
							if (isPrime(j) != 0 && isPrime(i - j) != 0)
							{
									System.out.print(i);
									System.out.print("=");
									System.out.print(j);
									System.out.print("+");
									System.out.print((i - j));
									System.out.print("\n");
									break;
							}
					}
			}
			return 0;
	}
}

