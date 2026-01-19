#include <stdio.h>

// structure definition
 typedef struct student
{
    int rollno;
    char name[10];
    int marks;
    
}student;

// function declarations
void store(struct student *s,int size);
void display(struct student *s,int size);

void main()
{
    struct student s1[2];
	int size=2;
    // function call
    store(s1,size);   // receive returned structure
    display(s1,size);
}


void store(struct student *s,int size)
{
	int i;
	for(i=0; i<size; i++)
	{
			printf("\nEnter student details:\n");
		
		    printf("Enter the roll no: ");
		    scanf("%d", &s[i].rollno);
		
		    printf("Enter the name: ");
		    scanf("%s", s[i].name);
		
		    printf("Enter the marks: ");
		    scanf("%d", &s[i].marks);
		
		
	}

}

void display( struct student *s,int size)
{
	int i;
	for(i=0; i<size; i++)
	{
				
		    printf("\n--- Student Details ---\n");
		    printf("Student roll no is : %d\n", s[i].rollno);
		    printf("Student name is    : %s\n", s[i].name);
		    printf("Student marks is   : %d\n", s[i].marks);	
		
		
	}
}

