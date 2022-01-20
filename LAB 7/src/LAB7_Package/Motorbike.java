package LAB7_Package;

public class Motorbike extends Vehicle{

	public void Move() {
		System.out.println(" --| Motorbike Move !!!");		
	}//End Method Move

	public void Move(String x , int y) {

		System.out.println(" --| MotorbikeMove : " + x + " distand " + y + " km ");		
		
	}//End Method Move
}
