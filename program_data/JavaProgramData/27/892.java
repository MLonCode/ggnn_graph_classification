package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float a;
		float b;
		float c;
		double x1;
		double x2;
		double r;
		double d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++)
		{
			a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (b * b - 4 * a * c > 0F)
			{
				x1 = (-b + Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);
				x2 = (-b - Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);
				if (b == 0F)
				{
					b = 0F;
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			else
			{
				if (b * b - 4.0 * a * c == 0F)
				{
					x1 = x2 = (-b) / (2.0 * a);
					System.out.printf("%.5f", "x1=x2=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", "\n");
				}
				else
				{
					if (b != 0F)
					{
						r = (-b) / (2 * a);
					}
					else
					{
						r = 0;
					}
					d = Math.sqrt(4.0 * a * c - b * b) / (2 * a);
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", r);
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", d);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", r);
					System.out.printf("%.5f", -d);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
			}
		}
		return 0;
	}

}

