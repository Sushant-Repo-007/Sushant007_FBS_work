#include<stdio.h>

int Totalsalary(float); //declaration 
//without parameter without  returntype

void main(){
	float Salary ,res;
	printf("Enter the number\n ");
	scanf("%f",&Salary);
	res=Totalsalary(Salary); //function calling 
	
	if(res>0)
	{
		printf("The total salary is: %f",res);	
	}
}

int Totalsalary(float x) //function called 
{
	float da,ta,hra,total_salary;
	
	if (x <=5000)
	{
		da = x*0.10;
		ta = x*0.20;
		hra = x*0.25;

	}
	else{
	
		da =x*0.15;
		ta = x*0.25;
		hra = x*0.30;
	
	}
	total_salary = da + ta + hra;
	return total_salary;
//	printf("The total salary is: %f",total_salary);

	

}
