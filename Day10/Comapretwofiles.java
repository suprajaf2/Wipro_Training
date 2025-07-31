package Day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Comapretwofiles {
	public static void main(String[]args)
	{
		try {
			BufferedReader b1 = new BufferedReader(new FileReader("C:\\Users\\M.SUPRAJA\\Downloads\\File1.txt"));
			BufferedReader b2 = new BufferedReader(new FileReader("C:\\Users\\M.SUPRAJA\\Downloads\\File2.txt"));
			String str1;
			String str2;
			boolean same = true;
			
			while((str1=b1.readLine())!= null | (str2=b2.readLine())!=null) {
				if(str1 ==null ||str2==null || !str1.equals(str2))
				{
					same =false;
					System.out.println("Both files not having same content");
					break;
				}
			}
			b1.close();
			b2.close();
			if(same) {
				System.out.println("Both as same content");
			}
			}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
	}

}
