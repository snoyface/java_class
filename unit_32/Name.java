// Name.java
/**
* Takes a persons name (with or without initals) and 
* returns full name, reversed name, and initials
* @author Jonathan MacLeod
* @version Last_modified November 28, 2014
*/

class Name
{
	//define object instances

	String firstName;
	char midName;
	String lastName;

	//constructors

	Name (String fn, char m, String ln)  //if they have all names
	{
		firstName = fn;
		midName = m;
		lastName = ln;
	}

	Name (String fn, String ln)  //if they have only first and last
	{
		firstName = fn;
		lastName = ln;
	}

	//methods for Name

	public String getNormalOrder()  //returns regular order
	{
		String normalOrder;

		if (midName == '\u0000')
		{
			normalOrder = firstName + " " + lastName;
		}else normalOrder = firstName + " " + midName + ". " + lastName;

		return normalOrder;
	}

	public String getReverseOrder()		//returns reversed order
	{
		String rOrder;
		if (midName == '\u0000')
		{
			rOrder = lastName + ", " + firstName;
		}else rOrder = lastName + ", " + firstName + " " + midName + ".";	 

		return rOrder;
	}

	public String getInitials()			//returns just initials
	{
		String iOrder;
		if (midName == '\u0000')
		{
			iOrder = "" + firstName.charAt(0) + lastName.charAt(0);
		} else iOrder = "" + firstName.charAt(0) + midName + lastName.charAt(0);
		return iOrder;
	}

}