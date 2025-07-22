package day2;

public class Switch {
	public static void main(String[] args) {

		char x = 'l';
		switch (x) 
		{
		case 'l' : 
		case 'L' : 
			System.out.println(x+" is a Letter");
			break;
		case 'm':
		case 'M' :
			System.out.println(x+" is a Digit");
			break;
		case 'n':
		case 'N' :	
			System.out.println(x+" is White Space");
			break;
		case 'k':
		case 'K':
			System.out.println(x+" is Special Symbol");
		default:
			System.out.println(x+" is other than letter, digit, space or special symbol ");
			break;
		}
	
	}
}
