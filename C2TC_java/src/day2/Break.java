package day2;

public class Break {
	public static void main(String[] args) {
		for (int i = 5; i < 100; i++) {
			if (i%10==0)
				break;
			System.out.println(i);
		}
	}
}
