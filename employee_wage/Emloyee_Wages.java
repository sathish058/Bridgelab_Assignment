package employee_wage;

public class Emloyee_Wages {

	public static void main(String[] args) {
		int part_time = 1;
		int full_time = 2;
		int emp_Rate_Hrs = 20;
		int empHrs = 0;
		int empWage = 0;
		
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == full_time)
			empHrs = 8;
		else if (empCheck == part_time)
			empHrs = 4;
		empWage = empHrs * emp_Rate_Hrs;
		System.out.println("Employee Wage is " +empWage);
	    }
	}
	    	