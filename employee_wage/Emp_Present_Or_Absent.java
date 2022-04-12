package employee_wage;

public class Emp_Present_Or_Absent {

	public static void main(String[] args) {
		int FULL_TIME =1;
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == FULL_TIME)
			System.out.println("Employee is Present");
		else 
			System.out.println("Employee is absent");
	}

}


