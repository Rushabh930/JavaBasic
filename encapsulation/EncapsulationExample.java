package encapsulation;

public class EncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars car = new Cars();
		car.setName("Tata Tiago");
		car.setTopSpeed(100);
		
		System.out.println(car.getName() +" top speed in MPH is "+car.getTopSpeedMPH());
		
		System.out.println(car.getName() +" top speed in KMH is "+ car.getTopSpeedKMH());
		
		
	}

}
