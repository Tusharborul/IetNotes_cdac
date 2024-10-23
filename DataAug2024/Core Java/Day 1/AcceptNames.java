import java.util.Scanner;

class AcceptNames{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
	 for(int i=0;i<10;i++){
		 System.out.println("enetr name:");
	    String nm=sc.next();
		System.out.println("Name : "+nm);
	 }
  }
}