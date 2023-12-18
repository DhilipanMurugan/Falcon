package javaTraining;

public class JavaMethod {

	public static void main(String[] args) {

		JavaMethod obj = new JavaMethod();
		obj.method1();
		method2();
		String myName = obj.method3(); //calling the String return type
		System.out.println(myName);

	}

	public void method1() {

		System.out.println("Hello ATMECS");

	}

	public static void method2() {

		System.out.println("Hello Static method");
	}

	public String method3() {

		System.out.println("Hello");
		return "Dhileeban"; 
		//Java String method ie.. return type
	}

}
