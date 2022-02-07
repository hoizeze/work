#include<stdio.h>
#include<math.h>
int main()
{
	int a,b,c,digit=1;
	scanf("%d",&a);
	c=a;
	for(;c>9;)
	{	
		digit=digit*10;
		c=c/10;
		
	}
	for(;digit>0;)
	{
		b=a/digit;
		switch(b)
		{
			case 0:printf("ling ");break;
			case 1:printf("yi ");break;
			case 2:printf("er ");break;
			case 3:printf("san ");break;
			case 4:printf("si ");break;
			case 5:printf("wu ");break;
			case 6:printf("liu ");break;
			case 7:printf("qi ");break;
			case 8:printf("ba ");break;
			case 9:printf("jiu ");break;
		}
		a=a%digit;
		digit=digit/10;
	}
 } 
