int main()
{
  int i;
  char c[n];
  gets(c);
  for(i=0;i<n;i++){
    if((c[i]=='0'||c[i]=='1'||c[i]=='2'||c[i]=='3'||c[i]=='4'
		||c[i]=='5'||c[i]=='6'||c[i]=='7'||c[i]=='8'
		||c[i]=='9')&&(c[i+1]!='0'&&c[i+1]!='1'&&c[i+1]!='2'&&c[i+1]!='3'&&c[i+1]!='4'
		&&c[i+1]!='5'&&c[i+1]!='6'&&c[i+1]!='7'&&c[i+1]!='8'
		&&c[i+1]!='9')) printf("%c\n",c[i]);
	else if((c[i]=='0'||c[i]=='1'||c[i]=='2'||c[i]=='3'||c[i]=='4'
		||c[i]=='5'||c[i]=='6'||c[i]=='7'||c[i]=='8'
		||c[i]=='9')&&(c[i+1]=='0'||c[i+1]=='1'||c[i+1]=='2'||c[i+1]=='3'||c[i+1]=='4'
		||c[i+1]=='5'||c[i+1]=='6'||c[i+1]=='7'||c[i+1]=='8'
		||c[i+1]=='9')) printf("%c",c[i]);
  }
  return 0;
}