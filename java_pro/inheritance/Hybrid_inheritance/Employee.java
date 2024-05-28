package inharetance;

public class Employee extends Member {

	String specialization;

	void setEmployeeDetails(String name,int age, String phone_number, String address, int salary,String specialization) {
		this.name = name;
		this.age = age;
		this.phone_number = phone_number;
		this.address = address;
		this.salary = salary;
		this.specialization=specialization;
	}
//	public Employee(String name, int age, String phone_number, String address, int salary,String specialization) {
//		super(name, age, phone_number, address, salary);
//		this.specialization=specialization;
//	}

	void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phone_number);
        System.out.println("Address: " + address);
        System.out.println("Specialization: " + specialization);
        printSalary();
    }
	
	
}
