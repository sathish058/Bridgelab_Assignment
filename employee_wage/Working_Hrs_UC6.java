package employee_wage;

public class Working_Hrs_UC6 {
	public static final int part_time = 1;
	 public static final int full_time = 2;
	 public static final int emp_Rate_Hrs = 20;
	 public static final int num_of_working_days = 2;
	 public static final int max_hrs_in_month = 10;

	public static void main(String[] args) {
		
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while (totalEmpHrs <= max_hrs_in_month && totalWorkingDays < num_of_working_days) {
			totalWorkingDays++;
			
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
		totalEmpHrs += empHrs;
		System.out.println("Day : " +totalWorkingDays + "Employee Hours : " +empHrs);
	}
		int totalEmpWage = totalEmpHrs * emp_Rate_Hrs;
		System.out.println("Total Wage is " +totalEmpWage);
	}

}
