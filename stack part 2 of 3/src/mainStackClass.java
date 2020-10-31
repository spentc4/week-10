import java.util.Stack;

public class mainStackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<bike> bikes = new Stack<bike>();
		
		bike bike1 = new bike(1,1,1);
		bikes.add(bike1);
		bike bike2 = new bike(2,2,2);
		bikes.add(bike2);
		bike bike3 = new bike(3,3,3);
		bikes.add(bike3);
		
		Stack<mountainBike> mBike = new Stack<mountainBike>();	
		mountainBike mb1 = new mountainBike(1,1,1,1);
		mBike.add(mb1);
		mountainBike mb2 = new mountainBike(2,2,2,2);
		mBike.add(mb2);
		mountainBike mb3 = new mountainBike(3,3,3,3);
		mBike.add(mb3);
		//adding to subclass class inheritance
		mBike.add((mountainBike) bike1);
	
	}

}
