class Tested{
	public static void main(String []args)
	{

		String s = "Java, Java, Java";

		System.out.println(s.substring(0, 4) == "Java");
		System.out.println(s.lastIndexOf ("av"));
		System.out.println(s.indexOf ('a', 5));

		System.out.println(s.indexOf("av", s.length()-10));
		// System.out.println(s.substring (s.lastIndexOf (s.charAt(5))));
		// System.out.println(s.substring (s.substring (2, s.length() - 3));
	
	}
}