package List;
import java.util.*;

public class ex_of_arraylist {
//	write a program to create the list of 10 integer . and display the total of all even numbers
//	difference between list and arraylist
//	difference between arraylist and lined list
	
	public static void main(String[] arg) {
	
		List<Integer> l2 = new ArrayList<Integer>(40);
		l2.add(12);
		l2.add(14);
		l2.add(12);
		l2.add(82);
		l2.add(55);
		l2.add(820);
		l2.add(28);
		l2.add(802);
		l2.add(811);
		l2.add(182);
		
		
		
		l2.forEach(v -> System.out.println(v));

		
//		System.out.println(l2);
//		
//		List<Integer> leven=new ArrayList<Integer>();
//		int total=0;
				
//		for(int i: l2) {
//			if(i%2==0) {
//				total=total+i;
//				
//			}
//		}
//		System.out.println(total);

	}
}
