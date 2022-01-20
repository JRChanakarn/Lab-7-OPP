package LAB7_Package;

public class Main {


	
	public static void main(String[] args) {
	
		
		Vehicle v = new Vehicle() ;
		Car c = new Car();
		SuperCar s = new SuperCar();
		Motorbike m = new Motorbike();
		Balloon b = new Balloon();
		Drone d =  new Drone();
		
		
		//#Vehicle
		v.Move();
		
		//Car
		c.Move();
		c.Move( 5 , 6);
		
		//SuperCar
		s.Move();
        
		//MotorBike
		m.Move();
		m.Move("Right", 60);
		
		//Balloon
		b.Move();
		
		//Drone
		int w = d.Move('s');
		System.out.println(" --| Wheel : " + w );
	}//End main

}
