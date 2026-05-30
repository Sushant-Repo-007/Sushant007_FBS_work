
// Custom Exceptions

import java.util.Scanner;


class EmptyNameException extends Exception {
    public EmptyNameException(String message) {
        super(message);
    }
}

class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}

class InvalidPercentageException extends Exception {
    public InvalidPercentageException(String message) {
        super(message);
    }
}

class NotFitForAdmissionException extends Exception {
    public NotFitForAdmissionException(String message) {
        super(message);
    }
}

class FeesNotPaidException extends Exception {
    public FeesNotPaidException(String message) {
        super(message);
    }
}

class InsufficientFeesException extends Exception {
    public InsufficientFeesException(String message) {
        super(message);
    }
}

// Admission Form Class

class AdmissionForm {

    private String studentName;
    private int age;
    private double percentage;
    private double courseFees;
    private double feesPaid;

    public AdmissionForm(String studentName, int age,
                         double percentage,
                         double courseFees,
                         double feesPaid) {

        this.studentName = studentName;
        this.age = age;
        this.percentage = percentage;
        this.courseFees = courseFees;
        this.feesPaid = feesPaid;
    }

    public void validateForm()
            throws EmptyNameException,
            UnderageException,
            InvalidPercentageException,
            NotFitForAdmissionException,
            FeesNotPaidException,
            InsufficientFeesException {

        if (studentName == null || studentName.trim().isEmpty()) {
            throw new EmptyNameException("Student name cannot be empty.");
        }

        if (age < 17) {
            throw new UnderageException("Age must be 17 or above.");
        }
        if (percentage < 0 || percentage > 100) {
            throw new InvalidPercentageException("Percentage must be between 0 and 100.");
        }

        if (percentage < 35) {
            throw new NotFitForAdmissionException("Student is not eligible for admission.");
        }

        if (feesPaid == 0) {
            throw new FeesNotPaidException("No fees have been paid.");
        }

        if (feesPaid < courseFees * 0.30) {
            throw new InsufficientFeesException("At least 30% of course fees must be paid.");
        }

      
    }
}

// Main Class

public class Test {

    public static void main(String[] args) {
    	
    
    
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the age here ");
    	int age=sc.nextInt();
    	
    	System.out.println("Enter the Studentname here ");
    	String  studentName =sc.next();
    	
    	System.out.println("Enter the Percentage here :");
    	double  percentage=sc.nextDouble();
    	
    	System.out.println("Enter the course Fees here ");
    	double  coursefees=sc.nextDouble();
    	
    	System.out.println("Enter the feespaid :");
    	double feespaid=sc.nextDouble();
    	
    	
  AdmissionForm form = new AdmissionForm(studentName, age, feespaid, feespaid, feespaid );
               
                                

        try {

            form.validateForm();

        } catch (EmptyNameException e) {
            System.out.println(e.getMessage());

        } catch (UnderageException e) {
            System.out.println(e.getMessage());

        } catch (InvalidPercentageException e) {
            System.out.println(e.getMessage());

        } catch (NotFitForAdmissionException e) {
            System.out.println(e.getMessage());

        } catch (FeesNotPaidException e) {
            System.out.println(e.getMessage());

        } catch (InsufficientFeesException e) {
            System.out.println(e.getMessage());
        }
        
        finally {
        	
        	System.out.println("Good job  !:");
        	
        }
        
    }
}