import java.util.Scanner;

public class TestStudentArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do { 
		System.out.println("1. Add new Student\n2. delete by ID\n3. search by Id");
		System.out.println("4. modify name\n5. Display All \n6.exit\nChoice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			StudentArray.addNewPerson();
			break;
		case 2:
			System.out.println("enetr id for delete");
			int id=sc.nextInt();
			boolean status=StudentArray.deleteById(id);
			if(status) {
				System.out.println("deleted successfully");
			}else {
				System.out.println("not found");
			}
			break;
		case 3:
			System.out.println("enetr id for searching data");
			id=sc.nextInt();
			Student p=StudentArray.getById(id);
			if(p!=null) {
				System.out.println(p);
			}
			else {
				System.out.println("not found");
			}
			break;
		case 4:
			System.out.println("enetr id to change name");
			id=sc.nextInt();
			System.out.println("enetr new Name");
			String name=sc.next();
			 status=StudentArray.modifyName(id,name);
			if(status) {
				System.out.println("updated successfully");
			}else {
				System.out.println("not found");
			}
			break;
//			
		case 5:
			Student[] arr=StudentArray.displayAll();
			for(Student p2:arr) {
				if(p2!=null) {
				   System.out.println(p2+"\n");
				}else {
					break;
				}
			} 
			break;
		
		case 6:
			System.out.println("Thank you for visiting....");
			sc.close();
			break;
		default:
			
			break;
			
		}
		}while(choice!=6);
		
	}
}
