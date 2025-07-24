package day2entities;

public class CustomerDemo {
	public static void main(String[] args) {
		Customer cd = new Customer();
		cd.setCid(1);
		cd.setCname("deepak");
		cd.setCity("Cuddalore");
		System.out.println(cd);
		
		Customer c2 = new Customer();
		c2.setCid(2);
		c2.setCname("dinesh");
		c2.setCity("Pondicherry");
		System.out.println(c2);
	}
}
