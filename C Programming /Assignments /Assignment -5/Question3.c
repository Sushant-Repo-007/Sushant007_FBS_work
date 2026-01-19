//Print an inverted right-angled triangle pattern
//Input: n = 5
void main()
{
		int n;
	printf("Print a right-angled triangle  pattern\n");  //question 
	printf("Please enter the input  size:");
	scanf("%d",&n); //taking user input  from the user 
	
	int i,j;
	for(i=n; i>=0; i--) //rows
	{
			for(j=0; j<i; j++) //columns
		{
				printf("* ");
		}
			printf("\n");
			
	}
}
