int main ()
{
int n,m;
scanf ("%d",&n);
double a[100],b[100],c[100],x1[100],x2[100],p[100],r[100],s[100];
for (m=0;m<n;m++)
{
scanf ("%lf %lf %lf\n",&a[m],&b[m],&c[m]);
if (b[m]*b[m]-4*a[m]*c[m]>0)
{
x1[m]=(-b[m] + sqrt(b[m]*b[m]-4*a[m]*c[m]))/(2*a[m]);
x2[m]=(-b[m] - sqrt(b[m]*b[m]-4*a[m]*c[m]))/(2*a[m]);
}
else if (b[m]*b[m]-4*a[m]*c[m]==0)
{
x1[m]=(-b[m] + sqrt(b[m]*b[m]-4*a[m]*c[m]))/(2*a[m]);
x2[m]=(-b[m] - sqrt(b[m]*b[m]-4*a[m]*c[m]))/(2*a[m]);
}
else
{
if (b[m]/(2*a[m])==0)
{p[m]=b[m]/(2*a[m]);}
else
{p[m]=-b[m]/(2*a[m]);}
r[m]=sqrt(4*a[m]*c[m]-b[m]*b[m])/(2*a[m]);
s[m]=-sqrt(4*a[m]*c[m]-b[m]*b[m])/(2*a[m]);
}
}
for (m=0;m<n;m++)
{
if (b[m]*b[m]-4*a[m]*c[m]>0)
{
printf ("x1=%.5lf;x2=%.5lf\n",x1[m],x2[m]);
}
else if (b[m]*b[m]-4*a[m]*c[m]==0)
{
printf ("x1=x2=%.5lf\n",x1[m]);
}
else
{
printf ("x1=%.5lf+%.5lfi;x2=%.5lf%.5lfi\n",p[m],r[m],p[m],s[m]);
}
}
return 0;
}