public class Method_Overloading {
	
	public void employee_details(String name) {
		System.out.println("Employee Name :" + name);
	}
	
	public void employee_details(int id) {
		System.out.println("Employee ID is :" + id);
	}
	public void employee_details(long salary, float pf) {
		System.out.println("Employee Salary is: " + " ," + "Employee Pf :" + pf);
	}
	
	
	public void employee_details(String name, int id) {
		System.out.println("Employee Name :" + name + " , " + "Employee id :" + id);
	}
	
	public void employee_details(int salary, int pf ) {
		System.out.println("Employee salary :" + salary + " , " + "Employee pf :" + pf);
	}
	
	public static void main(String[] args) {
		Method_Overloading mol = new Method_Overloading();
		mol.employee_details("Murugan");
		mol.employee_details(2216071);
		mol.employee_details(45356, 14538);
		mol.employee_details("Karthick", 2021567);
		mol.employee_details(35000, 400691);
	}

}
