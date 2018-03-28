package seleniumtutorialclasswork;

import seleniumtutorialclasswork.AClass;

public class MyClass {

	public static void main(String[] args) 
	{
		AClass obj = new AClass();
		System.out.println(obj.publicVariable);
		obj.publicMethod(99);		
	}

}
