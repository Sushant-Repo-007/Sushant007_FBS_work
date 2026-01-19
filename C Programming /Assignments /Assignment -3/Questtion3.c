void main()
{
//	sum=1+2+3+4+5;
	int start=1, end=5 ,sum=0;
	while(start<=end)
	{
		sum=sum+start;
//		printf("The Sum of the numbers are:%d\n",sum); if we state the statment here firstnit will print the value 
//			and then it will move to the next iteration that is i++ 
		start++;
	}
//	we have writtened the printf statement such that it will iterate after the iteration of i++
		printf("The Sum of the numbers are:%d\n",sum);
}
