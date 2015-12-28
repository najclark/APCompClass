package quater2;

interface rubia {
	//bike
	
	int WHEELS = 2;
	
	public String paintBike(String color);
	public double wheelSize(double wheel);
	public boolean hasBell(boolean bell);
	public int topGear(int z);
	
}

class Rubia implements rubia {

	String color;
	int gears;
	double wheel;
	boolean bell;
	
	@Override
	public String paintBike(String color) {
		this.color = color;
		return this.color;
	}

	@Override
	public double wheelSize(double wheel) {
		
		this.wheel = wheel;
		
		if(wheel == 18) {
			System.out.println("Yousa kid!");
		}
		else if(wheel == 26) {
			System.out.println("Yous adult!");
		}
		else if(wheel == 29.5){
			System.out.println("Yous a pro! ");
		}
		else {
			System.out.println("We dont have your size");
		}
		return wheel;
	}

	@Override
	public boolean hasBell(boolean bell) {
		this.bell = bell;
		return this.bell;
	}

	@Override
	public int topGear(int z) {
		gears = z;
		return gears;
	}	
}


