package main;
import java.io.File;
import java.util.Scanner;

public class IOTemplate {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = null; 
		try{
			// read text file and add the integers in the file
			int sum =0;
			File file = new File("absolute path of filename");
			scanner = new Scanner(file);
			while(scanner.hasNext()) {
				if(scanner.hasNextInt()) {
					int num = scanner.nextInt();
					sum +=num;
					System.out.println(num);
				}
				else {
					scanner.next();
				}
			}
			System.out.println(sum);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			if(scanner!=null) {
				scanner.close();
			}
		}
	}
}
