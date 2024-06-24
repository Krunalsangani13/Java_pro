package connection;

import java.sql.SQLException;
import java.util.Scanner;

public class demo {
	static Scanner sc=new Scanner(System.in);
	static int choice;
	public static void menu() {
		System.out.println("1.insert");
		System.out.println("2.delete");
		System.out.println("3.update");
		System.out.println("4.display");
		System.out.println("5.exit");
		System.out.println("enter your choice");
	    choice=sc.nextInt();
	}
	
	public static void main(String[] args) throws SQLException {
		int erollno;
		String name,stream;
		crud cd=new crud();
	
		cd.getconnection();
		
		 do{ 
			menu();
			switch(choice) {
			case 1:
				try {
					System.out.println("enter your enrollno");
					erollno=sc.nextInt();
					sc.nextLine();
					System.out.println("enter your name");
					name=sc.nextLine();
					System.out.println("enter your stream");
					stream=sc.nextLine();
					crud.getinsert(erollno,name,stream);
					
				} catch (SQLException e) {
					e.printStackTrace();
				};
				break;
				
			case 2:
				System.out.println("enter your enrollno");
				erollno=sc.nextInt();
				crud.getdelete(erollno);;
				break;
				
			case 3:
				
				System.out.println("enter your enrollno");
				erollno=sc.nextInt();
				sc.nextLine();
				System.out.println("enter your name");
				name=sc.nextLine();
				System.out.println("enter your stream");
				stream=sc.nextLine();
				crud.getupdate(erollno, name, stream);
				break;
				
			case 4:
				crud.getDisplay();
				break;
				
			case 5:
				break;
			}
		}while(choice!=0);
		
	}

}
