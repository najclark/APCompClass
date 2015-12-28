package quater1;

public class junkTester {

	public static void main(String[] args) {
		System.out.println("junk");
		//example 1
		System.out.println(hello());
		//example 2
		String x = hello();
		System.out.println(x);
		System.out.println(addition(5));
		System.out.println(addition(5));
		//                      pass by value
		System.out.println(multiply(4, 5));
		
	}
	//signature return type
	public static String hello(){
		String x = "hello";
		return x;
	}
	//                         parameters
	public static double addition(int a){
		//return type overrides any parameter
		//adds 5 to a number
		double x = a + 5;
		
		return x;
	}
	
	public static double multiply(int a, double b){
		return a * b;
	}
	

}
