package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		while ((c = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{


			int[] a = new int[105];

			int n;
			int i;
			int j;
			n = c.length();
			for (i = 0;i < n;i++)
			{
				a[i] = 1;
			}
			for (i = n - 1;i >= 0;i--)
			{
				if (c[i] == '(')

				{

					for (j = i;j < n;j++)
					{
						if ((c[j] == ')') && (a[j] != 0))
						{
							a[j] = 0;
							a[i] = 0;
							break;

						}

					}

				}

			}
			for (i = 0;i < n;i++)
			{
				System.out.print(c[i]);
			}
			System.out.print("\n");

			for (i = 0;i < n;i++)
			{
				if ((c[i] == '(') && (a[i] == 1))
				{

					System.out.print("$");
				}
				if ((c[i] == ')') && (a[i] == 1))
				{
					System.out.print("?");
				}
				if ((c[i] != '(') && (c[i] != ')') && (c[i] != '\0'))
				{
					System.out.print(" ");
				}
				if ((c[i] == '(') && (a[i] == 0))
				{
					System.out.print(" ");
				}
				if ((c[i] == ')') && (a[i] == 0))
				{
					System.out.print(" ");
				}


			}

			System.out.print("\n");
		}



		return 0;

	}
}

