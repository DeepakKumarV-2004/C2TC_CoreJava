package day5.multilevelinheritance.vehical;

public class VehicalDemo {

	public static void main(String[] args) {
		Car c;
		c=new Car();
		c.vehicleType();
		
		Maruthi m=new Maruthi();
		m.vehicleType();
		m.brand();
		m.speed();
		
		Maruti800 m1=new Maruti800();
		m1.vehicleType();
		m1.brand();
		m1.speed();
		
		
	}

}