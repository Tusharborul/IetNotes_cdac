public class Student {

	private int id;
	private String name;
	private float marks[]=new float[3];
	private float avg ;
	

	public Student() {
		this(0,null,null);
	}
	
	public Student(int id,String nm,float arr[]) {
		this.id=id;
		this.name=nm;
		this.marks=arr;
		this.avg=(marks[0]+marks[1]+marks[2])/3;
		
	}
	
//	Setter
	public Student(int id) {
		this.id=id;
		this.name=null;
		float arr[]=new float[3];
		arr[0]=0;
		arr[1]=0;
		arr[2]=0;
		
	}
	public float avgmarks() {
		return avg;
	};
	
	public void setname(String name) {
		this.name=name;
	}
	
	
	public void setMarks(float[] arr) {
		this.marks=arr;
	}
	
	//getter methods
	public int getid(){
		return id;
	}
	
	public String getname() {
		return name;
	}
	
	public float[] getMarks() {
		return marks;
	}
	public String toString() {
		//convert date to String
		return "Id : " +this.id+"\nName : "+name+"\nScience marks: "+marks[0]+"\nMath marks: "+marks[1]+"\nHistory marks: "+marks[2]+"\nAvgMarks : "+avg;
	}

}
