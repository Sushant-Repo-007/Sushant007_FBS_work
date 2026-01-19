#include<stdio.h>
void Totalsalary(); //declaration 
//without parameter without  returntype

void main(){
	
	Totalsalary(); //function calling 
}

void Totalsalary() //function called 
{
	float Salary,da,ta,hra,total_salary;
	Salary = 3000.00;
	
	if (Salary<=5000)
	{
		da = Salary*0.10;
		ta = Salary*0.20;
		hra = Salary*0.25;

	}
	else{
	
		da =Salary*0.15;
		ta = Salary*0.25;
		hra = Salary*0.30;
	
	}
	total_salary = da + ta + hra;
	printf("The total salary is: %f",total_salary);

	

}
