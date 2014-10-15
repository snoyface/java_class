class SimpleFoo{
	public static void main(String[] args) {
		SecondFoo foo = new SecondFoo();
		foo.sayYes();
		
	}
}

class SecondFoo {
	private String say = "YES!";
	public void sayYes(){
		System.out.println(say);
	}
}