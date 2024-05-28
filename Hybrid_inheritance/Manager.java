package inharetance;

public class Manager extends Member {
	String department;

	void setManagerDetails(String name,int age, String phone_number, String address, int salary,String department) {
		this.name = name;
		this.age = age;
		this.phone_number = phone_number;
		this.address = address;
		this.salary = salary;
		this.department=department;
	}
	
	 void displayManagerDetails() {
	        System.out.println("Manager Details:");
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Phone Number: " + phone_number);
	        System.out.println("Address: " + address);
	        System.out.println("Department: " + department);
	        printSalary();
	}
}
