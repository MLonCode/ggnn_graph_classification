//??:???
//???1000012856
//???2010.11.20
//???

int main()
{
	int a[4] = {0}, i, j, m, n;
	for(i = 10; i <= 50; i = i+10)
		for(j = 10; j <= 50; j = j+10)
			for(m = 10; m <= 50; m = m+10)
				for(n = 10; n <= 50; n = n+10)
				{
					a[0] = i;
					a[1] = j;
					a[2] = m;
					a[3] = n;
					if((a[0] != a[1] )&& (a[0] != a[2]) && (a[0] != a[3] )&& (a[1] != a[2]) && (a[1] != a[3]) && (a[2] != a[3]) && ((a[0] + a[1]) == ( a[2] + a[3])) && ((a[0] + a[3]) > (a[2] + a[1])) && ((a[0] + a[2]) < a[1]))
					{
						cout << 'l' << ' ' << a[3] << endl;
						cout << 'q' << ' ' << a[1] << endl;
						cout << 'z' << ' ' << a[0] << endl;
						cout << 's' << ' ' << a[2] << endl;
					}
				}

	return 0;
}
