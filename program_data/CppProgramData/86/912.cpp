//???????
//???2010.11.27
//??????
//???1000012856

int main()
{
	int i, n, k;						//i?k??????n????????
	cin >> n;
	for(i = 1; i <= n; i++)				//??n???
	{
		int j, wrong, w[20];			//j?????wrong?????????????w????????????????
		cin >> wrong;
		for(j = 0; j < wrong; j++)
			cin >> w[j];
		if(wrong == 0)					//????????60
			cout << 60 << endl;
		else							//??????????????????60s?
		{
			//?????????????????60s
			if(w[wrong - 1] + 3 * wrong <= 60)
				//??60-??????????
				cout << 60 - 3 * wrong << endl;
			else
			{
				//??????????
				for(k = wrong - 2; k >= 0; k--)
				{
					//w[k]?????????3*(k+1)??????????????????????60????????60s??
					if((w[k] + 3 * (k + 1) <= 60 ) && (w[k + 1] - w[k] >= 60 - w[k] - 3 * (k + 1))) 
					{
						cout << 60 - 3 * (k + 1) << endl;
						break;
					}
					//????????60s?????????60s??
					else if((w[k] + 3 * (k + 1) <= 60 ) && (w[k + 1] - w[k] < 60 - w[k] - 3 * (k + 1)))
					{
						//??????????????
						cout << w[k + 1] << endl;
						break;
					}
					else
						continue;
				}
			}
		}
	}

	return 0;
}



