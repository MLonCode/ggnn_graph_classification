package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int flag = 0;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 if (n % 3 == 0)
	 {
		 System.out.print(3);
	  flag = 1;
	 }
	 if (n % 5 == 0)
	 {
		 if (flag != 0)
		 {
		  System.out.print(" ");
		 }
	  System.out.print(5);
	  flag = 1;
	 }
	 if (n % 7 == 0)
	 {
		 if (flag != 0)
		 {
		  System.out.print(" ");
		 }
	  System.out.print(7);
	 }
	 if (n % 3 != 0 && n % 5 != 0 && n % 7 != 0)
	 {
		 System.out.print("n");
	 }
	return 0;
	}
}

