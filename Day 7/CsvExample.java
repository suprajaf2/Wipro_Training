package Day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class CsvExample {

	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\M.SUPRAJA\\Downloads\\Temp.csv");
     try {
	BufferedReader b = new BufferedReader(new FileReader(f1));
    String line=b.readLine();
    while(line!=null){
    	System.out.println("File contains " + line);
    	line =b.readLine();
    }
    b.close();
	}
     catch(FileNotFoundException e)
     {
    	 System.out.println("File not found error");
     }
     catch(IOException e)
     {
    	 System.out.println("An IO error occured while reading the file");
     }
     finally {
    	 System.out.println("The Execution is Done");
     }
     
	}
}