package employee_wage;

public class Wages_For_Month {
	public static final int part_time = 1;
	 public static final int full_time = 2;
	 public static final int emp_Rate_Hrs = 20;
	 public static final int num_of_working_days = 2;

	public static void main(String[] args) {
		
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		
		for (int day = 0; day < num_of_working_days;day ++) {
		
		int empCheck = (int)Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
		
		case  full_time:
			empHrs = 8;
			break;
		case part_time:
			empHrs = 4;
			break;
		default :
			empHrs = 0;
		}
		empWage = empHrs * emp_Rate_Hrs;
		totalEmpWage += empWage;
		System.out.println("Employee Wage is " +empWage);
	}
		System.out.println("Total Wage is " +totalEmpWage);
	}
}
