#include <stdio.h>
int main()
{
int n,m,i,j;
scanf("%d",&n);
scanf("%d",&m);
int a[n],b[m];
for(i=0;i<n;i++)
{
    scanf("%d",&a[i]);
}
for(j=0;j<m;j++)
{
    scanf("%d",&b[j]);
}
 printf("A-B IS\n");

for(i=0;i<n;i++)
 {
 int flag=0;
 for(j=0;j<m;j++)
 {
 if(a[i]==b[j])
 {
 flag=1;
 break;
 }
 }
 if(flag==0)
 printf("%d ",a[i]);
 }
 return 0;
}
