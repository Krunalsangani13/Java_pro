package java_pro;

public class Students {
	private String name;
	
	public Students() {
		this.name = "unknown";
	}

	public Students(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students("krunal"); 
		Students s2 = new Students();
		
		System.out.println(s1.getName());
		System.out.println(s2.getName());

	}

}
