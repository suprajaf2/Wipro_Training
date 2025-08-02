package Day12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferwriter {

	public static void main(String[] args) throws IOException {
		BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\M.SUPRAJA\\Downloads\\File1.txt"));
		{
			br.write("This is wriiten using Filewriter");
			br.newLine();
			br.close();
			System.out.println("writtern sucsessfully");
		}
		

	}

}
