package vehicles;

public class vehicle {

	public static String MAKE = "Agurt";
	public static int numvehicles = 0;
	
	private String Chassisno;
	private String model;
	
	public vehicle(String model) {
		numvehicles++;
		Chassisno = "ch" + numvehicles;
		this.model = model;
		System.out.println("vehicle manufacturado");	
		
	}
	 public static class Engine extends vehicle{
		 private static final String MAKE = "predicter";
		 private static final int CAPACITY = 1600;
		 
		 public Engine(String model) {
			 super(model);
		 }
		 
		 public static String getMAKE() {
			 return MAKE;
		 }
		 
		 public static int getCapacity() {
				return CAPACITY;
			}
	 }
	 
	 public void setMAKE(String mak) {
		 this.MAKE = mak;
	 }
	
	
		public String getChassisno() {
			return Chassisno;
		}
	
	  public void setChassisno(String Chassisno) {
		  this.Chassisno = Chassisno;
	  }
		
	  public String getmodel() {
		  return model;
	  }
	
	 public void setmodel(String model) {
		 this.model = model;
	 }
	 
	
	 public String toString() {
		 return " The vehicle is manufacturado by: " + vehicle.MAKE + " The model type is " +this.model
				 + " The chassis number is " + Chassisno + " The engine make is " + Engine.getMAKE()
				 + " The engine capacity is " + Engine.getCapacity() + " cc ";
		
	 }
}
