package vehicles;

public class textvehicle {
	 public static void main(String[] args) {
			
		  System.out.println("manufacturado Augurt" + vehicle.MAKE);
		  System.out.println(" number de vehicle manufacturado: " + vehicle.numvehicles);
		  
		  vehicle vehicle1 = new vehicle("vision");
		  System.out.println(vehicle1);
		  
		  vehicle vehicle2 = new vehicle("Edict");
		  System.out.println(vehicle2);
		  
		  vehicle2.setMAKE("seer");
		  System.out.println(vehicle1);
		  System.out.println(vehicle2);
		  
		  System.out.println("number of vehicles manufacturado: " + vehicle.numvehicles);
		  
		  
		  
		  
	}

}
