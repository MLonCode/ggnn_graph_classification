int main()
{
	int a[100][100],b[100][100],c[100][100];
	int x1,x2,x3,y1,y2,y3,i,j,k;
    cin>>x1>>y1;
	for(i=0;i<x1;i++)
	{
		for(j=0;j<y1;j++)
		{
			cin>>a[i][j];
		}
	}
	    cin>>x2>>y2;
	for(i=0;i<x2;i++)
	{
		for(j=0;j<y2;j++)
		{
			cin>>b[i][j];
		}
	}
	for(i=0;i<x1;i++)
	{
		for(j=0;j<y2;j++)
		{
			for(k=0;k<y1;k++)
			{
				c[i][j]=c[i][j]+a[i][k]*b[k][j];
			}
		}
	}
		for(i=0;i<x1;i++)
	{
		for(j=0;j<y2;j++)
		{
             cout<<c[i][j];
			 if(j!=y2-1) cout<<" ";
			 else cout<<endl;
		}
	}
	
	return 0;
}
