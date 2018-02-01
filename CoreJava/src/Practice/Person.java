package Practice;

abstract public class Person {
	private String name;
    protected char sex;
    public int age;
	  Person()
	  {
		  name=null;
		  sex='u';
		  age=0;
	  }
    Person(String name, char sex, int age)
    {
  	  this.name = name;
  	  this.sex = sex;
  	  this.age = age;
    }
    String getName()
    {
    	return name;
    }
    void Display()
    {
    	System.out.println(name);
    	System.out.println(sex);
    	System.out.println(age);
    }
    
}

