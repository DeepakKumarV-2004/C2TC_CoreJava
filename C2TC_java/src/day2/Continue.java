package day2;

public class Continue {
	public static void main(String[] args) {
		for (int k = 5; k < 100; k++)
		{
		if (k%5 == 0) {
		continue;
		}
		System.out.print(k + " ");
		}
	}
}
