    import java.io.IOException;
	import java.io.PrintStream;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
	import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
public class Go {
		
		public static void main(String[] a) throws Exception {
			try {
				
		      Scanner read1 = new Scanner (new File("Purchases.txt"));
		      
			  read1.useDelimiter(",");
			  
			  
			  while  (read1.hasNext()) {
		                  
			  String tokens = read1.next();
				
			  System.out.println(tokens);
			  
			   BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			   
			  
			  writer.write(tokens);
			  
			  writer.close();
			  
			  
		      } }
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}

		private static int findInLine(Scanner read1) {
			// TODO Auto-generated method stub
			return 0;
		}

		private static void toArray(String stuff) {
			// TODO Auto-generated method stub
			
		}
		}
	
			

		
			
			
