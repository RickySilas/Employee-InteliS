//Example of a Checked Exception (IOException)

import java.io.*;
public class CheckedException {

	public static void main(String[] args) throws IOException
	{
		FileReader file = new FileReader("C:\\user\\real.xml");
		BufferedReader fileInput = new BufferedReader(file);
		
		for (int counter = 0; counter < 3; counter++)
			System.out.println(fileInput.readLine());
		fileInput.close();

	}

}