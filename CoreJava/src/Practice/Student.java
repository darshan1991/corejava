package Practice;

public class Student extends Person {
	 {
	    	int RollNo;
	    	String Branch;
	    	Student(String name, char sex, int age, int RollNo, String branch)
	    	{
	    		super(name, sex, age);
	    		this.RollNo = RollNo;
	    		this.branch = branch;
	      	}
	    	void Display()
	    	{
	    		System.out.println(RollNo);
	        	System.out.println(Branch);
	    		System.out.println(name);
	        	System.out.println(sex);
	        	System.out.println(age);
	        	
	    	}
	        void TestMethod()
	    {
	    	name = "Darshan";
	    	sex = 'M';
	    	RollNo=20;
	      	    }
	    }
}
