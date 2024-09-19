package encapsulation;

public class StudentData {

	private String name ;
	private int id ;
	private float fees;
	private char grade;
	
	void setName(String n)
	{
		name = n;
	}
	void setId (int i)
	{
		id = i;
	}
	void setFees (float f)
	{
		fees = f;
	}
	void setGrade (char c)
	{
		grade = c;
	}
	
	//getter
	String getName()
	{
		return name;
	}
	int getId ()
	{
		return id;
	}
	float getFees ()
	{
		return fees;
	}
	char getGrade ()
	{
		return grade;
	}

}