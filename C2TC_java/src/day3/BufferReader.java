package day3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferReader {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		System.out.println("Enter name: ");
		name = br.readLine();
		int id;
		System.out.println("Enter Your Id");
		id = Integer.parseInt(br.readLine());
		float marks;
		System.out.println("Enter marks : ");
		marks = Float.parseFloat(br.readLine());
		
		System.out.println("Name:" + name+ "id : "+ id+"marks : "+marks);
	}
}
