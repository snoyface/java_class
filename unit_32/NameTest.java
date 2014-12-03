//NameTest.java

/*
* main method to test out Name.java
*
* @author Jonathan MacLeod
* @version last_modified nov 27, 2014
*/

class NameTest
{
	public static void main (String[]args)
	{
		Name teacher = new Name ("Henery", 'H', "Leitner");
		Name tf = new Name ("Jan", "Jackson");

		System.out.println(teacher.getNormalOrder());
		System.out.println(teacher.getReverseOrder());
		System.out.println(teacher.getInitials());


		System.out.println(tf.getNormalOrder());
		System.out.println(tf.getReverseOrder());
		System.out.println(tf.getInitials());

	}

}