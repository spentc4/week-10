import java.util.PriorityQueue;

public class carArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<car> cars = new PriorityQueue<car>(3);
		car car1 = new car(1,1,1);
		cars.add(car1);
		car car2 = new car(2,2,2);
		cars.add(car2);
		car car3 = new car(3,3,3);
		cars.add(car3);
		
		PriorityQueue<SUV> suvs = new PriorityQueue<SUV>(3);
		SUV suv1 = new SUV(1,2,3,4);
		suvs.add(suv1);
		SUV suv2 = new SUV(5,6,7,8);
		// adding from other class to subclass inheritance
		suvs.add((SUV)car1);
		
		suvs.add(suv2);
		SUV suv3 = new SUV(9,10,11,12);
		suvs.add(suv3);
		
		
	}

}
