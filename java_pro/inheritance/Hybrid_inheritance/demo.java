package inharetance;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee();
		Manager m=new Manager();
		
		e.setEmployeeDetails("krunal", 22, "6352441107", "RJT", 250000, "application dev");
		m.setManagerDetails("krupal", 23,"6352441108", "AHM", 35000, "web dev");
		
		e.displayEmployeeDetails();
		System.out.println();
		m.displayManagerDetails();
	}

}
