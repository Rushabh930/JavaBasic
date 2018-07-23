/**
 * 
 */
package abstraction;

/**
 * @author SRS
 *
 */
public class Cars {

	int currentSpeed;
	String name;
	
	public Cars(String name) {
		this.name = name;
	}

	public void accelerate() {
		currentSpeed = currentSpeed+10;
	}
	
	public void park(){
		currentSpeed=0;
	}
	
	public void printCurrentSpeed() {
		System.out.println("Current Speed of "+ name +" is "+currentSpeed+" mpH");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cars audi = new Cars("Audi");
		Cars tata = new Cars("Tata");
		
		audi.printCurrentSpeed();
		audi.accelerate();
		audi.accelerate();
		
		audi.printCurrentSpeed();
		audi.park();
		audi.printCurrentSpeed();
		
		System.out.println("**************************************");
		
		tata.printCurrentSpeed();
		
		tata.accelerate();
		tata.accelerate();
		tata.accelerate();
		
		tata.printCurrentSpeed();
		tata.park();
		tata.printCurrentSpeed();
		
	}

}
