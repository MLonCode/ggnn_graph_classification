int main()
{
	int n=0,k=0,i=0,j=0,a[1001],s=0;//??????nkijs?????a
	cin>>n>>k;//??nk
	for(i=1;i<=n;i++)//???n??
	{
		cin>>a[i];
	}
	for(i=1;i<=n;i++)//?????????????k
	{
		for(j=i+1;j<=n;j++)
		{
			if(a[i]+a[j]==k)//??????????k
			{
				s=s+1;//s??1
			}
		}
	}
	if(s==0)//??s???????????????k?
		cout<<"no"<<endl;//??no
	else//??s???????????????k?
		cout<<"yes"<<endl;//??yes

	return 0;
}