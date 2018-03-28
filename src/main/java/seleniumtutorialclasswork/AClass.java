package seleniumtutorialclasswork;

 class AClass {

	int aVariable = 20;
	
	void aMethod(int x)
	{
		System.out.println("I am aMethod and the value you gave " + x);
	}

	public int publicVariable = 20;

	public void publicMethod(int x)
	{
		System.out.println("I am publicMethod and the value you gave " + x);
		privateMethod(33);
	}
	
	private int privateVariable = 20;

	private void privateMethod(int x)
	{
		System.out.println(privateVariable);
		aMethod(23);
		System.out.println("I am privateMethod and the value you gave " + x);
	}
}







