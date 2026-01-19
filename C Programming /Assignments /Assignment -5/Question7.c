//Print a Floyd’s triangle pattern
void main()
{
	int n;
	printf("Print a Floyd’s triangle pattern\n");  //question 
	printf("Please enter the input  size:");
	scanf("%d",&n); //taking user input  from the user 
    int num = 1;
	int i,j;
    for(i = 1; i <= n; i++) {
        for(j = 1; j <= i; j++) {
            printf("%d ", num);
            num++;
        }
        printf("\n");
    }
	
}
