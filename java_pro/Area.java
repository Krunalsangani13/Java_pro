package java_pro;

public class Area {
	private int length;
	private int breadth;
	
	void setdim(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	public double getarea() {
		return length*breadth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area rectangle=new Area();
		rectangle.setdim(5, 15);
		
		System.out.println("Area of Rectangle is: "+rectangle.getarea());

	}

}
