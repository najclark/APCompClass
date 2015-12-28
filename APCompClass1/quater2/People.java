package quater2;



abstract class Shape {
	
	private int a,b,c;
	
	private int zoom(){
		return 0;
	}
	
	public int area(){
		return 0;
	}
	public int parameter(){
		return 0;
	}
	
}

class Shape1 extends Shape {
	
}

class People {
	public static void main(String[] args) {
		Shape1 s1 = new Shape1();
		
	}
}