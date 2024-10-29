import java.util.Scanner;

public class StudentArray {

	private static Student[] strArr;
	private static int cnt;
	static {
		strArr=new Student[10];
		float[] arr= {50,60,70};
		float[] arr1= {70,75,80};
		float[] arr2= {99,98,97};
		strArr[0]=new Student(12,"Tushar",arr2);
		strArr[1]=new Student(13,"Rahul",arr1);
		strArr[2]=new Student(14,"Raj",arr);
		cnt=3;
	}
	public static void addNewPerson() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String name= sc.nextLine();
		
		float arr[]=new float[3];
		System.out.println("enter marks of science");
		arr[0]=sc.nextInt();
		System.out.println("enter marks of Math");
		arr[1]=sc.nextInt();
		System.out.println("enter marks of History");
		arr[2]=sc.nextInt();
		
		strArr[cnt]= new Student(id,name,arr);
		cnt++;
	}
	public static Student[] displayAll() {
		return strArr;
	}
	public static boolean deleteById(int id) {
		for(int i=0;i<cnt;i++) {
			if(strArr[i].getid()==id) {
				for(int j=i;j<cnt;j++) {
					strArr[j]=strArr[j+1]; 
				}
				cnt--;
				return true;
			}
			
		}
		
		return false;
	}
	public static Student getById(int id) {
		for(Student a:strArr) {
			if(a!=null) {
				if(a.getid()==id) {
				    return a;
			    }
		    }else {
		    	return null;
		    }
		
		}
		
		return null;
	}
//	public static void searchById() {
//		// TODO Auto-generated method stub
//		if(strArr!=null) {
//			if()
//		}
//	}
	public static boolean modifyName(int id, String name) {
		// TODO Auto-generated method stub
		Student s=getById(id);
		if(s!=null) {
			s.setname(name);
			return true;
		}
		 return false;
	}
}
